package com.higgsup.intern.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private int age;

    //Field injection
    //@Autowired
    private Address address1;

    private Account account1;

    public Person(){

    }
    public Person(String name){
        this.name = name;
    }

    public Person(Account account1){
        this.account1 = account1;
    }

    //Constructor injection

    public Person(Address address1){
        this.address1 = address1;
    }

    public Person(Address address1, Account account1){
        this.address1 = address1;
        this.account1 = account1;
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

    public Account getAccount1() {
        return account1;
    }

    //Setter injection
    //@Autowired
    public void setAccount1(Account account1) {
        this.account1 = account1;
    }

    //Setter injection
    //@Autowired
    public void setAddress1(Address address1){
        this.address1 = address1;
    }

    public void show(){
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address1 + ", Account info: " + account1);
    }
}
