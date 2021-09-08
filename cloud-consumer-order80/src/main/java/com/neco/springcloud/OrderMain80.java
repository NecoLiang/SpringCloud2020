package com.neco.springcloud;

import com.neco.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author liangyt
 * @create 2021-08-04 20:39
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "cloud-provider-payment",configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args){
        SpringApplication.run(OrderMain80.class,args);
    }

}
