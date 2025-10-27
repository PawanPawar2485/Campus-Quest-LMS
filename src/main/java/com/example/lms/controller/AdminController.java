package com.example.lms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "admin-dashboard";
    }

    // ADDED: Route for admin to view users page
    @GetMapping("/admin/users")
    public String adminUsers() {
        return "admin-users"; // You'll need to create this page
    }

    // ADDED: Route for admin to view courses page
    @GetMapping("/admin/courses")
    public String adminCourses() {
        return "admin-courses"; // You'll need to create this page
    }

    // ADDED: Route for admin announcements
    @GetMapping("/admin/announcements")
    public String adminAnnouncements() {
        return "admin-announcements"; // You'll need to create this page
    }
}