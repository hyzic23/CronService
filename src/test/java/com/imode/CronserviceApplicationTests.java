package com.imode;

import com.imode.model.AccountDetail;
import com.imode.model.PaymentDetails;
import com.imode.service.PaymentService;
import com.imode.service.Schedular;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CronserviceApplicationTests {

    Logger logger = LoggerFactory.getLogger(CronserviceApplicationTests.class);


    @Autowired
    Schedular schedular;

    @Autowired
    PaymentService paymentService;


    @Test
    void contextLoads() {
    }

    @Test
    public void getCustomerDetails()
    {
        AccountDetail response = schedular.getCustomerDetails();
    }

    @Test
    public void getPaymentDetails()
    {
        List response = paymentService.getAllPayments();
        logger.info( "PaymentDetails Lenght : " + response.size());

        response.forEach(pay -> {
            logger.info( "Payments : " + pay);
           // System.out.println(pay);
        });

    }



}
