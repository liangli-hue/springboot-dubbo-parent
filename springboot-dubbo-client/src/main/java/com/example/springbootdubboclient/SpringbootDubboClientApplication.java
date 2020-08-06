package com.example.springbootdubboclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:consumer.xml")
public class SpringbootDubboClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboClientApplication.class, args);
    }

}
