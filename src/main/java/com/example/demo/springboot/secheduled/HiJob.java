package com.example.demo.springboot.secheduled;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;

public class HiJob extends QuartzJobBean {
    @Autowired
    private IMailService iMailService;
    @Autowired
    private StudentMapper studentMapper;
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        List<Student> students = studentMapper.selectStudentList();
        students.forEach(student -> {
            iMailService.sendSimpleMail("kh17754032397@163.com","邮件主题",student.getName()+"祝你生日快乐");
            student.setStudentStatus("YES");
            studentMapper.updateById(student);
        });
        System.out.println("    Hi! :" + jobExecutionContext.getJobDetail().getKey());
    }
}