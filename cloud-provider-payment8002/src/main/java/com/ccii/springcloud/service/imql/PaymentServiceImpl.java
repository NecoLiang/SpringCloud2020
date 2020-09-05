package com.ccii.springcloud.service.imql;

import com.ccii.springcloud.dao.PaymentDao;
import com.ccii.springcloud.entities.Payment;
import org.springframework.stereotype.Service;
import com.ccii.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @author liangyt
 * @create 2020-07-02 22:04
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
         return paymentDao.create(payment);
    }
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
