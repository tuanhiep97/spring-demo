package com.higgsup.intern.spring.demo;

import com.higgsup.intern.spring.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Using the @Configuration tells the Spring IoC container to use it as a source of bean definitions.
@Configuration

//Application config class
public class AppConfig {

    @Autowired
    private Account account;

    //The @Bean annotation tells Spring that this method will return an object
    // that should be registered as a bean in the Spring application context.

    @Bean
    public Person person(){
        return new Person(account); //inject the dependencies by having one bean method calling another.
    }

    // method name will be used as the bean id when Spring register this bean
    @Bean
    public Account account(){
        return new Account();
    }

    public Address address(){return new Address(); }
}
