package com.higgsup.intern.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class Account {
    private String bankName = "TPBank";

    public String getBankName(){
        return this.bankName;
    }
    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public String toString(){
        return bankName;
    }
}
