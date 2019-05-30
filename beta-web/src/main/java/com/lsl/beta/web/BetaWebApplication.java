package com.lsl.beta.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource({"classpath*:spring/dubbo-consumer.xml"})
public class BetaWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BetaWebApplication.class, args);
    }
}
