package com.gowtham.careerflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gowtham.careerflow.entity.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}