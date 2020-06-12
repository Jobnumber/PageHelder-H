package com.pageHelder.service.impl;

import com.github.pagehelper.PageInfo;
import com.pageHelder.domain.User;
import com.pageHelder.service.UserService;
import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void getAll() {
        List<User> users=userService.getAll();
        Assert.assertNotNull(users);
        System.out.println("users = " + users);
    }

    @Test
    public void findByPage() {
        userService.findByPage(1, 10);


    }
}