package com.chen.service.impl;

import com.chen.TransactionalAppStart;
import com.chen.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TransactionalAppStart.class)
public class UserServiceImplTest {

    @Autowired
    private IUserService iUserService;

    @Test
    public void testGetAll() {
        iUserService.getAll().forEach(System.out::println);
    }

    @Test
    public void testDeleteById() {
        try {
            int i = iUserService.deleteById(7L);
            System.out.println("=====:"+i);
        } catch (RuntimeException e) {
            System.out.println("异常异常异常");
        }
    }
}