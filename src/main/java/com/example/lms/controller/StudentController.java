package com.example.lms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/student/dashboard")
    public String studentDashboard() {
        return "student-dashboard";
    }

    // ADDED: Route for student courses view
    @GetMapping("/student/courses")
    public String studentCourses() {
        return "courses";
    }

    // ADDED: Route for student assignments
    @GetMapping("/student/assignments")
    public String studentAssignments() {
        return "assignments";
    }

    // ADDED: Route for student quizzes
    @GetMapping("/student/quizzes")
    public String studentQuizzes() {
        return "quizzes";
    }

    // ADDED: Route for student submissions - KEEP THIS ONE
    @GetMapping("/student/submissions")
    public String studentSubmissions() {
        return "submissions";
    }
}