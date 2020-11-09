package com.pb.springcloud.service;

import com.pb.springcloud.entity.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById( Long id);
}
