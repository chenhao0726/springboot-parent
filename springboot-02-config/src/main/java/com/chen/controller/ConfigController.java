package com.chen.controller;

import com.chen.domain.Employees;
import com.chen.domain.JdbcProperties;
import com.chen.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfigController {

    @Autowired
    private User user;

    @Value("${user.username}")
    private String username;

    @Value("${user.password}")
    private String password;

    @Autowired
    private JdbcProperties jdbcProperties;

    @ResponseBody
    @RequestMapping("/config")
    public String config() {
        return username+"-----"+password;
    }

    @ResponseBody
    @RequestMapping("/config1")
    public User config1() {
        return user;
    }

    @ResponseBody
    @RequestMapping("/config2")
    public JdbcProperties config2() {
        return jdbcProperties;
    }


    @Autowired
    private Employees employees;

    @ResponseBody
    @RequestMapping("/config3")
    public Employees config3() {
        return employees;
    }

}
