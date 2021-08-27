package com.neco.springcloud.service.imql;

import com.neco.springcloud.dao.PaymentDao;
import com.neco.springcloud.entities.Payment;
import com.neco.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liangyt
 * @create 2021-07-02 22:04
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
