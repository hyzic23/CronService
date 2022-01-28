package com.imode.exception;

import lombok.Data;

@Data
public class ItemErrorResponse {

    public ItemErrorResponse(){}

    private int status;
    private String message;
    private long timeStamp;


    public ItemErrorResponse(int status, String message, long timeStamp){
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }


}
