package com.gowtham.careerflow.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gowtham.careerflow.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

    List<Application> findByCandidateId(Long candidateId);

    List<Application> findByJobId(Long jobId);
}