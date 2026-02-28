package com.pool.readio.admin.service.impl;

import cn.hutool.json.JSONUtil;
import com.pool.readio.admin.dto.OssCallbackParam;
import com.pool.readio.admin.dto.OssCallbackResult;
import com.pool.readio.admin.dto.OssPolicyResult;
import com.pool.readio.admin.service.OssService;
import io.minio.PostPolicy;
import io.minio.credentials.Credentials;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Base64;
import java.util.Date;
import java.util.Map;

/**
 * MinIO 对象存储上传管理 Service 实现（S3 兼容，替代原阿里云 OSS）
 */
@Service
public class OssServiceImpl implements OssService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OssServiceImpl.class);
    private static final String MINIO_REGION = "us-east-1";

    @Value("${minio.policy.expire}")
    private int policyExpire;
    @Value("${minio.maxSize}")
    private int maxSize;
    @Value("${minio.callback}")
    private String callbackUrl;
    @Value("${minio.bucket}")
    private String bucketName;
    @Value("${minio.endpoint}")
    private String endpoint;
    @Value("${minio.access-key}")
    private String accessKey;
    @Value("${minio.secret-key}")
    private String secretKey;
    @Value("${minio.dir.prefix}")
    private String dirPrefix;

    @Override
    public OssPolicyResult policy() {
        OssPolicyResult result = new OssPolicyResult();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dir = dirPrefix + sdf.format(new Date());
        long maxSizeBytes = maxSize * 1024L * 1024L;
        ZonedDateTime expiration = ZonedDateTime.now().plusSeconds(policyExpire);

        try {
            PostPolicy policy = new PostPolicy(bucketName, expiration);
            policy.addStartsWithCondition("key", dir);
            policy.addContentLengthRangeCondition(0, maxSizeBytes);

            Credentials creds = new Credentials(accessKey, secretKey, null, null);
            Map<String, String> formData = policy.formData(creds, MINIO_REGION);

            String host = endpoint.replaceAll("/$", "") + "/" + bucketName;

            String credential = formData.get("x-amz-credential");
            result.setAccessKeyId(credential != null ? credential.split("/")[0] : accessKey);
            result.setPolicy(formData.get("policy"));
            result.setSignature(formData.get("x-amz-signature"));
            result.setDir(dir);
            result.setHost(host);
            result.setXAmzAlgorithm(formData.get("x-amz-algorithm"));
            result.setXAmzCredential(credential);
            result.setXAmzDate(formData.get("x-amz-date"));
            OssCallbackParam callback = new OssCallbackParam();
            callback.setCallbackUrl(callbackUrl);
            callback.setCallbackBody("filename=${object}&size=${size}&mimeType=${mimeType}&height=${imageInfo.height}&width=${imageInfo.width}");
            callback.setCallbackBodyType("application/x-www-form-urlencoded");
            result.setCallback(Base64.getEncoder().encodeToString(JSONUtil.toJsonStr(callback).getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            LOGGER.error("MinIO 上传策略生成失败", e);
        }
        return result;
    }

    @Override
    public OssCallbackResult callback(HttpServletRequest request) {
        OssCallbackResult result = new OssCallbackResult();
        String filename = request.getParameter("filename");
        if (filename != null) {
            String fileUrl = endpoint.replaceAll("/$", "") + "/" + bucketName + "/" + filename;
            result.setFilename(fileUrl);
        }
        result.setSize(request.getParameter("size"));
        result.setMimeType(request.getParameter("mimeType"));
        result.setWidth(request.getParameter("width"));
        result.setHeight(request.getParameter("height"));
        return result;
    }
}
