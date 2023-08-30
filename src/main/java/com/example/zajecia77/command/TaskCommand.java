package com.example.zajecia77.command;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskCommand {
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
}
