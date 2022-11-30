package com.chen.controller;

import com.chen.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private User user;

    @Value("${user.username}")
    private String name;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello springboot，hello"+name;
    }

    @RequestMapping("/config")
    @ResponseBody
    public User config() {
        return user;
    }
}
