package com.pool.readio.admin.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.pool.readio.admin.service.UmsResourceService;

import jakarta.annotation.PostConstruct;


/**
 * 路径与资源访问对应关系操作组件
 * Created by macro on 2020/7/17.
 */
@Component
public class PathResourceRulesHolder {

    @Autowired
    private UmsResourceService resourceService;

    @PostConstruct
    public void initPathResourceMap(){
        resourceService.initPathResourceMap();
    }
}
