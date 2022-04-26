package com.raven.secondnode;

import com.raven.services.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: raven
 * @date: 2022/4/6
 * @description:
 */
@RestController
public class LoginController {

    private static Logger logger = LogManager.getLogger(LoginController.class);

    @DubboReference(check = false, async=false)
    private UserService userService;

    @GetMapping("login")
    public String login(@RequestParam String userName) throws Exception {
        logger.info("second");

        if (!userService.checkUser(userName)) {
            throw new Exception( userName + " login failed.");
            //return userName + " login failed.";
        }

        String result = userService.getUserInfo(userName);

        return result;

    }
}
