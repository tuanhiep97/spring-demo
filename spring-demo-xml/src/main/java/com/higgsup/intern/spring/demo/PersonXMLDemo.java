package com.higgsup.intern.spring.demo;

import com.higgsup.intern.spring.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonXMLDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");
        Person p = applicationContext.getBean(Person.class);
        p.show();

    }
}
