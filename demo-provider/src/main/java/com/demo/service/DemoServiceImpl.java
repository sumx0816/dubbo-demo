package com.demo.service;

import api.DemoService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author sumx
 * 首个duboo实例的service实现
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String doDemo() {
        return "hello world";
    }
}
