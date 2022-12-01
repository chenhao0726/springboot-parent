package com.chen;

import com.chen.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestAppStart.class)
public class SpringBootTestTest {

    @Autowired
    private User user;

    @Test
    public void test() {
        System.out.println(user);
    }
}
