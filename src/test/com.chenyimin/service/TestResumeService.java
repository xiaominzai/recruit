package com.chenyimin.service;

import domain.Resume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.ResumeService;
import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestResumeService {
    @Autowired
    private ResumeService resumeService;

    @Test
    public void insertResume(){
        Resume resume = new Resume();
        resume.setDetail("这是一个url");
        resume.setEmail("这是一个邮箱");
        boolean b1 = resumeService.insertResume(resume);
        assertTrue(b1);
    }

    @Test
    public void deleteResumt(){
        boolean b1 = resumeService.deleteResume(2);
        boolean b2 = resumeService.deleteResume(1);
        assertTrue(b1);
        assertTrue(!b2);
    }
}
