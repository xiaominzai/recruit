package com.chenyimin.service;

import domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;
import units.Ip;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

import static org.junit.Assert.*;
//基于junit4的spring测试框架
@RunWith(SpringJUnit4ClassRunner.class)
//启动spring容器
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestUserService {

    @Autowired
    private UserService userService;

    @Test
    public void hasMatchUser(){
        boolean b1 = userService.hasMatchUser("admin","admin");
        boolean b2 = userService.hasMatchUser("admin","1111");
        boolean b3 = userService.hasMatchUser("aaa","123");
        assertTrue(b1);
        assertTrue(!b2);
        assertTrue(!b3);

    }

    @Test
    public void findUserByUserName(){
        User user = userService.findUserNames("admin");
        assertEquals(user.getUserName(), "admin");
    }

    @Test
    public void loginSuccess(){
        User user = userService.findUserNames("admin");
        user.setLastIp("127.0.0.2");
        user.setLastVisit(new Date());

        userService.loginSuccess(user);
    }

    @Test
    public void registerUser(){
        /*
        user_name, password,last_ip, phone, sex, dob, email, country, work_time, jiaoyu, self_me
         */
        User user = new User();
        user.setUserName("啊狗");
        user.setPassword("admin");
        user.setLastIp("127.0.0.1");
        user.setPhone("66666");
        user.setSex("男");
        user.setDob("我？");
        user.setEmail("哈哈");
        user.setCountry("国家？");
        user.setWork_time("工作时间");
        user.setJiaoyu("教育");
        user.setSelf_me("self+me");
        boolean b1 = userService.registerUser(user);
        assertTrue(b1);
    }






}
