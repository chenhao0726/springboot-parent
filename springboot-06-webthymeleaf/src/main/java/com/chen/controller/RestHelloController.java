package com.chen.controller;

import com.chen.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestHelloController {

    private List<User> list = new ArrayList<>();

    {
        list.add(new User("Tom", "1234", 21));
        list.add(new User("Jack", "123456", 23));
    }


    @RequestMapping("/hello01")
    public ModelAndView hello1() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", list);
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    @RequestMapping("/hello02")
    public List hello2() {
        return list;
    }
}
