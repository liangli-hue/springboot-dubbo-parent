package com.example.springbootdubboserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:provider.xml")
public class SpringbootDubboServerApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SpringbootDubboServerApplication.class, args);
        //pom中没有加spring-boot-starter-web依赖，启动时没有tomcat容器，会自动退出，所以加了一个sleep防止自动退出
        Thread.sleep(Long.MAX_VALUE);
    }

}
