package com.example.service.impl;

import api.DemoService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.example.service.ConsumerService;
import org.springframework.stereotype.Service;

/**
 * @author sumx
 * service Impl
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Reference(check = false)
    private DemoService demoService;

    @Override
    public String doDemo() {
        return demoService.doDemo();
    }
}
