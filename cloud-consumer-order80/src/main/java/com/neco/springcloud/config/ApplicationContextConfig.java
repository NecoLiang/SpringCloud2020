package com.neco.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author liangyt
 * @create 2021-08-04 21:10
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced//增加负载均衡能力
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
