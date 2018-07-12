package com.higgsup.intern.spring.demo;

import com.higgsup.intern.spring.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonJavaConfigDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person p = context.getBean(Person.class);
        p.show();
    }
}
