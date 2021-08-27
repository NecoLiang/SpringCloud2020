package com.neco.springcloud.service;

import com.neco.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author liangyt
 * @create 2021-07-02 22:01
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
