package com.gowtham.careerflow.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gowtham.careerflow.entity.Job;
import com.gowtham.careerflow.service.JobService;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/post/{recruiterId}")
    public Job createJob(@PathVariable Long recruiterId,
                         @RequestBody Job job) {
        return jobService.createJob(job, recruiterId);
    }
}