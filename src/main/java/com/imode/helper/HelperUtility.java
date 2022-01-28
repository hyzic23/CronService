package com.imode.helper;

import com.imode.config.ApplicationPropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HelperUtility {

    @Autowired
    ApplicationPropertiesConfig appConfig;

    public HttpHeaders getHeaders()
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("X-CallerID",appConfig.getCallerId());
        headers.add("X-CallerName",appConfig.getCallerName());
        headers.add("X-CallerPassword",appConfig.getCallerPassword());
        return headers;
    }


}
