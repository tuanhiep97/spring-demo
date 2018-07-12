package com.higgsup.intern.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String address = "3 Cau Giay";

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String toString(){
        return address;
    }
}
