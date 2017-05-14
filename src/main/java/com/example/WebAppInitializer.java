package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by tarit on 2017. 05. 14..
 */
@SpringBootApplication(scanBasePackages={"com.example"}) // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class WebAppInitializer {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(WebAppInitializer.class, args);
    }
}
