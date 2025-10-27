//InstructorController.java
package com.example.lms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InstructorController {

    @GetMapping("/instructor/dashboard")
    public String instructorDashboard() {
        return "instructor-dashboard";
    }

    // ADDED: Route for instructor courses
    @GetMapping("/instructor/courses")
    public String instructorCourses() {
        return "courses";
    }

    // ADDED: Route for instructor assignments
    @GetMapping("/instructor/assignments")
    public String instructorAssignments() {
        return "assignments";
    }

    // ADDED: Route for instructor quizzes
    @GetMapping("/instructor/quizzes")
    public String instructorQuizzes() {
        return "quizzes";
    }

    // ADDED: Route for instructor announcements
    @GetMapping("/instructor/announcements")
    public String instructorAnnouncements() {
        return "announcements";
    }
}
