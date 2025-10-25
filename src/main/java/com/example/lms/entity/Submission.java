package com.example.lms.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Submission {
    @Id @GeneratedValue
    private Long id;
    @ManyToOne
    private Assignment assignment;
    @ManyToOne
    private User student;
    private LocalDate submissionDate;
    private int score;
    private String feedback;
    // Getters, setters
}