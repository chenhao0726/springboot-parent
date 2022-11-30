package com.chen.controller;

import com.chen.domain.JdbcProperties;
import com.chen.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @Value("person")
    private List<Object> person;

    public List<Object> getPerson() {
        return person;
    }

    public void setPerson(List<Object> person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "ConfigController{" +
                "person=" + person +
                '}';
    }

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

    @ResponseBody
    @RequestMapping("/config3")
    public List<Object> config3() {
        return person;
    }

}
