package com.Demo.Hello.Service.ResponseEntity;

import org.springframework.stereotype.Service;

@Service
public class StringResponse {
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    private String response;


}