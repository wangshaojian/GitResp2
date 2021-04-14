package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@ComponentScan("com.msb.mapper")
public class testApplication {
    public static void main(String[] args) {
        SpringApplication.run(testApplication.class,args);
    }
}
