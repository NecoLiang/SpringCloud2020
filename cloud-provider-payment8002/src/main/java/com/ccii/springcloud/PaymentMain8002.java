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
public class PaymentMain8002 {
   public static void main(String[] args){
       SpringApplication.run(PaymentMain8002.class,args);
   }
}
