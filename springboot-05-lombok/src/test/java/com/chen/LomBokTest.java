package com.chen;

import com.chen.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LombokAppStart.class)
public class LomBokTest {

    @Autowired
    private User user;

    @Test
    public void test() {
        user.setUsername("Tom");
        user.setPassword("1111");
        user.setAge(21);
        System.out.println(user);
    }
}
