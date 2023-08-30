package com.example.zajecia77.repository;

import com.example.zajecia77.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
