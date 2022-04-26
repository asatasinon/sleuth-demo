package com.raven.thirdnode;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan(basePackages = "com.raven.thirdnode.services.impl")
@SpringBootApplication
public class ThirdNodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirdNodeApplication.class, args);
    }

}
