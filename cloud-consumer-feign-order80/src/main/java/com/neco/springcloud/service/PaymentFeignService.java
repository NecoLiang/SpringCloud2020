package com.neco.springcloud.service;

import com.neco.springcloud.entities.CommonResult;
import com.neco.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author liangyt
 * @create 2021-09-08 11:30
 */
@Component
@FeignClient("CLOUD-PROVIDER-PAYMENT")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
     CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/timeout")
    String openFeignTimeOut();


}
