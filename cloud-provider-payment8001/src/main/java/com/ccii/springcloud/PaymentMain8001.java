package com.ccii.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liangyt
 * @create 2020-07-02 21:06
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8001 {
   public static void main(String[] args){
       SpringApplication.run(PaymentMain8001.class,args);
   }
}
