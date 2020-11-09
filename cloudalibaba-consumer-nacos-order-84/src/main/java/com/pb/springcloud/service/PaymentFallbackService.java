package com.pb.springcloud.service;

import com.pb.springcloud.entity.CommonResult;
import com.pb.springcloud.entity.Payment;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {

        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }


    @Override
    public String getPayment(Long id) {
        return "限流啦先溜了";
    }
}
