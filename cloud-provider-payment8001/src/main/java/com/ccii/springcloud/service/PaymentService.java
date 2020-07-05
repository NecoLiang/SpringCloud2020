package com.ccii.springcloud.service;

import com.ccii.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author liangyt
 * @create 2020-07-02 22:01
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id")Long id);
}
