package com.example.ft2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication(scanBasePackages = {"com.example.ft2"})
@MapperScan("com.example.ft2.mybatis")
@EnableScheduling
public class Ft2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ft2Application.class, args);
    }


}
