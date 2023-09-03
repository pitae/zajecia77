package com.example.zajecia77.controller;

import com.example.zajecia77.command.UserCommand;
import com.example.zajecia77.domain.User;
import com.example.zajecia77.dto.UserDto;
import com.example.zajecia77.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<UserDto> add(@RequestBody UserCommand userCommand) {
        return new ResponseEntity<>(modelMapper.map(userService.create(modelMapper.map(userCommand, User.class)), UserDto.class), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<UserDto>> getAll() {
        return new ResponseEntity<>(userService.findAll().stream().map(user -> modelMapper.map(user, UserDto.class)).toList(), HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> findById(@PathVariable("userId") Long userId) {
        return new ResponseEntity<>(modelMapper.map(userService.findById(userId), UserDto.class), HttpStatus.OK);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<?> deleteById(@PathVariable("userId") Long userId) {
        userService.deleteById(userId);
        return ResponseEntity.noContent().build();
    }
}
