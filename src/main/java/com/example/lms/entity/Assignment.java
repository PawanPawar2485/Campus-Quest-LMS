package com.example.lms.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Assignment {
    @Id @GeneratedValue
    private Long id;
    private String title;
    @ManyToOne
    private Course course;
    private LocalDate dueDate;
    private int maxScore;
    // Getters, setters
}