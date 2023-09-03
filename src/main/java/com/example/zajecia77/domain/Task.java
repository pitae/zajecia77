package com.example.zajecia77.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tasks3")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
