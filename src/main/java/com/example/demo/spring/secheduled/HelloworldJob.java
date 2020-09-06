package com.example.demo.spring.secheduled;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloworldJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Hello world!:" + jobExecutionContext.getJobDetail().getKey());
    }
}