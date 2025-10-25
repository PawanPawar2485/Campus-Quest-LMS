package com.example.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Module {
    @Id @GeneratedValue
    private Long id;
    private String title;
    @ManyToOne
    private Course course;
    private int orderInCourse;
    // Getters, setters
}