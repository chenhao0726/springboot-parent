package com.chen.service.impl;

import com.chen.MybatisAppStart;
import com.chen.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisAppStart.class)
public class IEmployeeServiceImplTest {

    @Autowired
    private IEmployeeService iEmployeeService;

    @Test
    public void testQueryAll() {
        iEmployeeService.queryAll().forEach(System.out::println);
    }
}