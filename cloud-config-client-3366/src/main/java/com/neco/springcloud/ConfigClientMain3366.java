package com.neco.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liangyt
 * @create 2021-09-13 17:16
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3366 {
    public static void main(String[] args)
    {
        SpringApplication.run(ConfigClientMain3366.class,args);
    }
}
