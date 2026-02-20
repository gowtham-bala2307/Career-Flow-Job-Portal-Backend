package com.gowtham.careerflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gowtham.careerflow.entity.Job;
import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {

    List<Job> findByRecruiterId(Long recruiterId);
}