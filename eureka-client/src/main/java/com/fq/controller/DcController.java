package com.fq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title : springCloud
 * @description:
 * @author: 番茄很忙
 * @date: 2017/11/29 14:01
 * @version: 1.0
 */
@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping(value="/dc")
    public String dc(){
        return "我是一个discoveryClient："+discoveryClient.getServices();
    }
}
