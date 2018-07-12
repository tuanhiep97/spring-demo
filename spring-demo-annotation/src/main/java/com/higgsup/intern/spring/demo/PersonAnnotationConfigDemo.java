package com.higgsup.intern.spring.demo;

import com.higgsup.intern.spring.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonAnnotationConfigDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        Person p = context.getBean(Person.class);
        p.show();
    }
}
