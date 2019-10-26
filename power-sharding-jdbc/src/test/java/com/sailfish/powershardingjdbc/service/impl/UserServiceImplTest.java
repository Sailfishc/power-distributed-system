package com.sailfish.powershardingjdbc.service.impl;

import com.sailfish.powershardingjdbc.entity.User;
import com.sailfish.powershardingjdbc.service.UserService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceImplTest {


    @Autowired
    private UserService userService;

    @Test
    public void testAdd() {
        User user = new User();
        user.setUserId(1L);
        user.setUsername("LiHuai");
        userService.add(user);

        User user2 = new User();
        user2.setUserId(2L);
        user2.setUsername("YeKai");
        userService.add(user2);
    }

    @Test
    public void testGetById() {
        User user1 = userService.getById(1L);
        if (user1 == null) {
            System.out.println("false");
        } else {
            Assert.assertEquals("LiHuai", user1.getUsername());
        }

        User user2 = userService.getById(2L);
        if (user2 == null) {
            System.out.println("false");
        } else {
            Assert.assertEquals("YeKai", user2.getUsername());
        }
    }

}