package com.chenyimin.service;

import domain.Job;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JobService {

    @Autowired
    private service.JobService jobService;

    @Test
    public void queryJob(){
        List<Job> allJob= jobService.queryAllJob();
        System.out.println(allJob.get(0).getJobname());


    }
}
