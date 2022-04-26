package com.raven.firstnode;

/**
 * @author: raven
 * @date: 2022/4/22
 * @description:
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration(proxyBeanMethods = false)
class MyConfiguration {
    @Bean
    RestTemplate myRestTemplate() {
        return new RestTemplate();
    }
}