package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Lurenc
 * @create 2021-07-11 18:33
 */
@SpringBootApplication
@MapperScan("com.dao")
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class, args);
    }
}
