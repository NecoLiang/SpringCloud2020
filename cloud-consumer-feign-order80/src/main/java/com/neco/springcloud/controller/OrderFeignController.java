package com.neco.springcloud.controller;

import com.neco.springcloud.entities.CommonResult;
import com.neco.springcloud.entities.Payment;
import com.neco.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liangyt
 * @create 2021-09-08 11:43
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById(id);
    }

  @GetMapping(value = "/consumer/payment/timeout")
    public String timeout()
    {
        return paymentFeignService.openFeignTimeOut();
    }

}
