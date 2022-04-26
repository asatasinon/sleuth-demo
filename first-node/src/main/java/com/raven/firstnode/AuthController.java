package com.raven.firstnode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: raven
 * @date: 2022/4/22
 * @description:
 */

@RestController
public class AuthController {


    private static Logger logger = LogManager.getLogger(AuthController.class);

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/token")
    public String getToken(@RequestParam String userName) {

        logger.info("first");

        String result = restTemplate.getForObject("http://localhost:9092/login?userName=" + userName, String.class);

        return result;

    }

    @GetMapping("/user")
    public String getUserInfo(@RequestParam String userName) {

        return userName;

    }


}
