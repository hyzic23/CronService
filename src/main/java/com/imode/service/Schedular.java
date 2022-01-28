package com.imode.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.imode.config.ApplicationPropertiesConfig;
import com.imode.helper.HelperUtility;
import com.imode.model.AccountDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

@Component
public class Schedular {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    HelperUtility utility;

    @Autowired
    ApplicationPropertiesConfig appConfig;


    Logger logger = LoggerFactory.getLogger(Schedular.class);

    @Scheduled(cron = "0 * * * * *")
    public void cronJobSch() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = sdf.format(now);
        System.out.println("Java cron job expression:: " + strDate);
    }

    //Get Customer Details
    public AccountDetail getCustomerDetails()
    {
        AccountDetail accountDetail = new AccountDetail();
        ObjectMapper objectMapper = new ObjectMapper();
        String response = null;
        String accountNumber = "1020155974";
        //Assert.notNull(accountNumber, "Account Number mustn't be null");
        try
        {
            String url = appConfig.getBaseUrl()+appConfig.getGetCustomerDetails()+accountNumber;
            HttpEntity<String> entity = new HttpEntity<String>(utility.getHeaders());
            accountDetail =  restTemplate.exchange(url, HttpMethod.GET, entity, AccountDetail.class).getBody();
            String accountDetailsJson = objectMapper.writeValueAsString(accountDetail);
            logger.info("Response " + accountDetailsJson);
            accountDetail = objectMapper.readValue(accountDetailsJson, AccountDetail.class);
        }
        catch (Exception ex)
        {
            logger.error("AccountDetail Exception " + ex.getMessage());
        }
        return accountDetail;
    }





}
