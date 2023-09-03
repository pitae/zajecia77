package com.example.zajecia77.controller;

import com.example.zajecia77.command.TaskCommand;
import com.example.zajecia77.command.UserCommand;
import com.example.zajecia77.domain.Task;
import com.example.zajecia77.domain.User;
import com.example.zajecia77.dto.TaskDto;
import com.example.zajecia77.dto.UserDto;
import com.example.zajecia77.service.TaskService;
import com.example.zajecia77.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;
    private final ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<TaskDto> add(@RequestBody TaskCommand taskCommand) {
        return new ResponseEntity<>(modelMapper.map(taskService.create(modelMapper.map(taskCommand, Task.class)), TaskDto.class), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<TaskDto>> getAll() {
        return new ResponseEntity<>(taskService.findAll().stream().map(task -> modelMapper.map(task, TaskDto.class)).toList(), HttpStatus.OK);
    }

    @GetMapping("/{taskId}")
    public ResponseEntity<TaskDto> findById(@PathVariable("taskId") Long taskId) {
        return new ResponseEntity<>(modelMapper.map(taskService.findById(taskId), TaskDto.class), HttpStatus.OK);
    }

    @DeleteMapping("/{taskId}")
    public ResponseEntity<?> deleteById(@PathVariable("taskId") Long taskId) {
        taskService.deleteById(taskId);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{taskId}")
    public ResponseEntity<TaskDto> update(@PathVariable Long taskId, @RequestBody TaskCommand taskCommand) {
        return new ResponseEntity<>(modelMapper
                .map(taskService.update(taskId, taskCommand), TaskDto.class), HttpStatus.OK);
    }
}
