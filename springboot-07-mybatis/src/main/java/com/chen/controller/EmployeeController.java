package com.chen.controller;

import com.chen.domain.Employee;
import com.chen.service.impl.IEmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeServiceImpl iEmployeeService;

    @RequestMapping("/employee")
    public ModelAndView employee() {
        ModelAndView modelAndView = new ModelAndView();
        List<Employee> employeeList = iEmployeeService.queryAll();
        modelAndView.addObject("list", employeeList);
        modelAndView.setViewName("hello");
        return modelAndView;
    }

}
