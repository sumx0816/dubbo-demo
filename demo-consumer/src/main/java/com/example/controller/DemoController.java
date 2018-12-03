package com.example.controller;

import com.example.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sumx
 * dubbo 首个demo实例的controller
 */
@RestController
public class DemoController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("/demo")
    public String doDemo(){
        return consumerService.doDemo();
    }
}
