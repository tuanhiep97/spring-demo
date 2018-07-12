package com.higgsup.intern.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Person {

    private String name;
    private int age;

    //Field injection
    //@Autowired
    private Address address;

    private Account account;

    public Person(){

    }
    public Person(String name){
        this.name = name;
    }

    public Person(Account account){
        this.account = account;
    }

    //Constructor injection

    public Person(Address address){
        this.address = address;
    }

    public Person(Address address, Account account){
        this.address = address;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Account getAccount() {
        return account;
    }

    //Setter injection
    //@Autowired
    public void setAccount(Account account) {
        this.account = account;
    }

    //Setter injection
    //@Autowired
    public void setAddress(Address address){
        this.address = address;
    }

    public void show(){
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address + ", Account info: " + account);
    }
}
