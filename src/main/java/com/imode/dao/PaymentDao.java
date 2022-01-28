package com.imode.dao;

import com.imode.model.PaymentDetails;

import java.util.List;

public interface PaymentDao {

    List<PaymentDetails> getAllPayments();
    void save(PaymentDetails paymentDetails);
    PaymentDetails getPaymentDetailsById(int id);
}
