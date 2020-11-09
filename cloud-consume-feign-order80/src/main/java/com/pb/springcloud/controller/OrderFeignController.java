package com.pb.springcloud.controller;

import com.pb.springcloud.entity.CommonResult;
import com.pb.springcloud.entity.Payment;
import com.pb.springcloud.service.PaymentFeignService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/consumer")
@RestController
public class OrderFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id ){
        return paymentFeignService.getPaymentById(id);
    }

    /*@GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //OpenFeign客户端一般默认等待一秒钟
        return paymentFeignService.paymentFeignTimeout();
    }*/
}
