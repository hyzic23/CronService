package com.imode.service;

import com.imode.dao.PaymentDao;
import com.imode.model.PaymentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService  {

    @Autowired
    private PaymentDao paymentDao;

    public List<PaymentDetails> getAllPayments()
    {
        return paymentDao.getAllPayments();
    }


}
