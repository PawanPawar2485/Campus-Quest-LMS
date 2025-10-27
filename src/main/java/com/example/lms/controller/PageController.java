package com.example.lms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/courses")
    public String coursesPage() {
        return "courses";
    }

    @GetMapping("/assignments")
    public String assignmentsPage() {
        return "assignments";
    }

    @GetMapping("/messages")
    public String messagesPage() {
        return "messages";
    }

    @GetMapping("/quizzes")
    public String quizzesPage() {
        return "quizzes";
    }

    @GetMapping("/announcements")
    public String announcementsPage() {
        return "announcements";
    }

    // Remove the duplicate mapping for /student/submissions
    // This is handled by StudentController
}