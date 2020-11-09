package com.pb.springcloud.service;


import com.pb.springcloud.entity.CommonResult;
import com.pb.springcloud.entity.Payment;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
//@Component
public interface PaymentService
{
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);


    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Long id);
}