package com.guts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.List;

@ConfigurationProperties(prefix = "loans")
public class LoansContactInfoDTO {
    private String message;
    private HashMap<String, String> email_name;
    private List<String> mobile_number;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HashMap<String, String> getEmail_name() {
        return email_name;
    }

    public void setEmail_name(HashMap<String, String> email_name) {
        this.email_name = email_name;
    }

    public List<String> getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(List<String> mobile_number) {
        this.mobile_number = mobile_number;
    }
}