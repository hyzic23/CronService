package com.imode.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")

public class ApplicationPropertiesConfig {

    @Value( "${base.url}" )
    private String baseUrl;

    @Value( "${getCustomerDetails.url}" )
    private String getCustomerDetails;

    //Zencore Headers
    @Value( "${zencore.callerId}" )
    private String callerId;

    @Value( "${zencore.callerName}" )
    private String callerName;

    @Value( "${zencore.callerPassword}" )
    private String callerPassword;


    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getGetCustomerDetails() {
        return getCustomerDetails;
    }

    public void setGetCustomerDetails(String getCustomerDetails) {
        this.getCustomerDetails = getCustomerDetails;
    }

    public String getCallerId() {
        return callerId;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    public String getCallerName() {
        return callerName;
    }

    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public String getCallerPassword() {
        return callerPassword;
    }

    public void setCallerPassword(String callerPassword) {
        this.callerPassword = callerPassword;
    }



}
