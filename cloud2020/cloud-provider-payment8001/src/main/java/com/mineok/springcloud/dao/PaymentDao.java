package com.mineok.springcloud.dao;

import com.mineok.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
