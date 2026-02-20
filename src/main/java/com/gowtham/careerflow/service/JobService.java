package com.gowtham.careerflow.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gowtham.careerflow.entity.Job;
import com.gowtham.careerflow.entity.User;
import com.gowtham.careerflow.enums.Role;
import com.gowtham.careerflow.repository.JobRepository;
import com.gowtham.careerflow.repository.UserRepository;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private UserRepository userRepository;

    public Job createJob(Job job, Long recruiterId) {

        User recruiter = userRepository.findById(recruiterId)
                .orElseThrow(() -> new RuntimeException("Recruiter not found"));

        if (recruiter.getRole() != Role.RECRUITER) {
            throw new RuntimeException("Only recruiters can post jobs");
        }

        job.setRecruiter(recruiter);
        job.setPostedDate(LocalDate.now());

        return jobRepository.save(job);
    }
}