package com.pb.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentHystrixServiceHandle implements PaymentHystrixService{
    @Override
    public String paymentInfoOk(Integer id) {

        return null;
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return null;
    }
}
