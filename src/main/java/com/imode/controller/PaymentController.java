package com.imode.controller;

import com.imode.model.PaymentDetails;
import com.imode.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/payment/getAllPayments")
    public List<PaymentDetails> getAllPayments()
    {
        return paymentService.getAllPayments();
    }

}
