package com.assetmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.assetmanager"}) // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class WebAppInitializer {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(WebAppInitializer.class, args);
    }
}
