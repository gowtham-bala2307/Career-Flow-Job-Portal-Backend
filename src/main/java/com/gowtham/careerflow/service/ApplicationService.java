package com.gowtham.careerflow.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gowtham.careerflow.entity.Application;
import com.gowtham.careerflow.entity.Job;
import com.gowtham.careerflow.entity.User;
import com.gowtham.careerflow.enums.ApplicationStatus;
import com.gowtham.careerflow.enums.Role;
import com.gowtham.careerflow.repository.ApplicationRepository;
import com.gowtham.careerflow.repository.JobRepository;
import com.gowtham.careerflow.repository.UserRepository;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JobRepository jobRepository;

    public Application applyForJob(Long candidateId, Long jobId) {

        User candidate = userRepository.findById(candidateId)
                .orElseThrow(() -> new RuntimeException("Candidate not found"));

        if (candidate.getRole() != Role.CANDIDATE) {
            throw new RuntimeException("Only candidates can apply for jobs");
        }

        Job job = jobRepository.findById(jobId)
                .orElseThrow(() -> new RuntimeException("Job not found"));

        Application application = new Application();
        application.setCandidate(candidate);
        application.setJob(job);
        application.setStatus(ApplicationStatus.APPLIED);
        application.setAppliedDate(LocalDate.now());

        return applicationRepository.save(application);
    }
}