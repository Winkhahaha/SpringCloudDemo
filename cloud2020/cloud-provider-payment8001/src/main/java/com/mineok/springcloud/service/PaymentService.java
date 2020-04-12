package com.mineok.springcloud.service;


import com.mineok.springcloud.dao.PaymentDao;
import com.mineok.springcloud.entities.Payment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Transactional
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
