package com.neco.spring.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author liangyt
 * @create 2021-09-07 11:04
 */
@RestController
public class OrderZKController {
    @Resource
    private RestTemplate restTemplate;

    public static final String INVOKE_URL="http://cloud-provider-payment";
    @GetMapping("/consumer/payment/zk")
    public String paymentInfo(){
        String forObject = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
        return forObject;
    }
}
