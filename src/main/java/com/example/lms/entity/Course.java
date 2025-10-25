package com.example.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
    @Id @GeneratedValue
    private Long id;
    private String title;
    private String description;
    @ManyToOne
    private User instructor;
    private String status;
    // Getters, setters
}