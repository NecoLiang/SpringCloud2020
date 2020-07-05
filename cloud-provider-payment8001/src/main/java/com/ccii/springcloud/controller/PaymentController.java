package com.ccii.springcloud.controller;

import com.ccii.springcloud.entities.CommonResult;
import com.ccii.springcloud.entities.Payment;
import com.ccii.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author liangyt
 * @create 2020-07-02 22:08
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("*******插入结果："+result);
        if (result>0){
            return new CommonResult(200,"插入数据库成功",result);

        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }

    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*******查询结果："+payment);
        if (payment!=null){
            return new CommonResult(200,"查询数据库成功",payment);

        }else {
            return new CommonResult(444,"查询数据库失败，查询id为："+id,null);
        }

    }
}
