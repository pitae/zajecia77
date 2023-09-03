package com.example.zajecia77.service;

import com.example.zajecia77.command.TaskCommand;
import com.example.zajecia77.domain.Task;
import com.example.zajecia77.domain.User;
import com.example.zajecia77.exception.ObjectNotFoundException;
import com.example.zajecia77.repository.TaskRepository;
import com.example.zajecia77.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public Task create(Task task) {
        return taskRepository.save(task);
    }

    public Task findById(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(Task.class.getName()));
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }

    public Task update(Long id, TaskCommand task) {
        Task taskToUpdate = findById(id);
        taskToUpdate.setDescription(task.getDescription());
        taskToUpdate.setStartDate(task.getStartDate());
        taskToUpdate.setEndDate(task.getEndDate());
        taskToUpdate.setStatus(task.getStatus());
        return taskRepository.save(taskToUpdate);
    }
}
