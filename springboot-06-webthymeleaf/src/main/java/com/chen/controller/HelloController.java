package com.chen.controller;

import com.chen.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/thyme")
    public String hello(Model model) {
        List<User> list = new ArrayList<>();
        list.add(new User("Tom", "1234", 21));
        list.add(new User("Jack", "123456", 23));
        model.addAttribute("list", list);
        return "hello";
    }

    @ResponseBody
    @RequestMapping("/json")
    public List json() {
        List<User> list = new ArrayList<>();
        list.add(new User("Tom", "1234", 21));
        list.add(new User("Jack", "123456", 23));
        return list;
    }

}
