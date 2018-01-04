package com.chenyimin.service;

import domain.Job;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//基于junit4的spring测试框架
@RunWith(SpringJUnit4ClassRunner.class)
//启动spring容器
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JobService {

    @Autowired
    private service.JobService jobService;

    public void addJob(){
        Job job = new Job();
        job.setImg("我是图片");
        job.setAddress("我是地址");
        job.setFu_title("我是副标题");
        job.setJobname("我是工作名");
        job.setTitle("我是标题");
        jobService.addJob(job);
    }

    public void deleteJob(){

    }
}
