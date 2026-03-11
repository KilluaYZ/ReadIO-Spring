package com.pool.readio.auth.config;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;
import com.pool.readio.mbg.mapper.UmsAdminMapper;
import com.pool.readio.mbg.model.UmsAdmin;
import com.pool.readio.mbg.model.UmsAdminExample;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.oidc.OidcScopes;
import org.springframework.security.oauth2.server.authorization.client.InMemoryRegisteredClientRepository;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
import org.springframework.security.oauth2.server.authorization.settings.AuthorizationServerSettings;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.UUID;

@Configuration
public class AuthSecurityConfig {

    /**
     * 注册 OAuth2 客户端：
     * - readio-gateway：authorization_code + refresh_token（与 application.yml 中配置一致）
     * - locust-admin-client：client_credentials，用于压测脚本直接换取管理端访问 token
     */
    @Bean
    public RegisteredClientRepository registeredClientRepository(PasswordEncoder passwordEncoder) {
        RegisteredClient gatewayClient = RegisteredClient.withId(UUID.randomUUID().toString())
                .clientId("readio-gateway")
                .clientSecret(passwordEncoder.encode("123456"))
                .clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
                .authorizationGrantType(AuthorizationGrantType.REFRESH_TOKEN)
                .redirectUri("http://127.0.0.1:9100/login/oauth2/code/readio-gateway-oidc")
                .scope(OidcScopes.OPENID)
                .scope("admin")
                .scope("portal")
                .build();

        RegisteredClient locustClient = RegisteredClient.withId(UUID.randomUUID().toString())
                .clientId("locust-admin-client")
                .clientSecret(passwordEncoder.encode("locust-secret"))
                .clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
                .authorizationGrantType(AuthorizationGrantType.CLIENT_CREDENTIALS)
                .scope("admin")
                .build();

        return new InMemoryRegisteredClientRepository(gatewayClient, locustClient);
    }

    /**
     * 基于数据库的用户信息加载：使用 readio-mbg 生成的 UmsAdminMapper。
     */
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder,
                                                 UmsAdminMapper umsAdminMapper) {
        return username -> {
            UmsAdminExample example = new UmsAdminExample();
            example.createCriteria().andUsernameEqualTo(username);
            java.util.List<UmsAdmin> admins = umsAdminMapper.selectByExample(example);
            if (admins == null || admins.isEmpty()) {
                throw new UsernameNotFoundException("用户不存在: " + username);
            }
            UmsAdmin admin = admins.get(0);
            if (Boolean.FALSE.equals(admin.getStatus())) {
                throw new UsernameNotFoundException("用户已被禁用: " + username);
            }
            // 数据库中的密码已经是加密后的，直接使用即可
            return User.withUsername(admin.getUsername())
                    .password(admin.getPassword())
                    .roles("ADMIN")
                    .build();
        };
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    /**
     * 使用自签名 RSA 密钥对签发 JWT，并通过 JWK 集合对外暴露公钥。
     */
    @Bean
    public JWKSource<SecurityContext> jwkSource() throws Exception {
        KeyPair keyPair = generateRsaKey();
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
        RSAKey rsaKey = new RSAKey.Builder(publicKey)
                .privateKey(privateKey)
                .keyID(UUID.randomUUID().toString())
                .build();
        JWKSet jwkSet = new JWKSet(rsaKey);
        return (jwkSelector, securityContext) -> jwkSelector.select(jwkSet);
    }

    @Bean
    public AuthorizationServerSettings authorizationServerSettings() {
        return AuthorizationServerSettings.builder()
                .issuer("http://127.0.0.1:9401")
                .build();
    }

    private static KeyPair generateRsaKey() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        return keyPairGenerator.generateKeyPair();
    }
}