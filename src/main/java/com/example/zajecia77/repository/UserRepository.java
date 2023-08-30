package com.example.zajecia77.repository;

import com.example.zajecia77.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
