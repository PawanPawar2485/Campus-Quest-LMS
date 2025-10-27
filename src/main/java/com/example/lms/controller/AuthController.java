//AuthController.java
package com.example.lms.controller;

import com.example.lms.entity.User;
import com.example.lms.entity.Role;
import com.example.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        return "login";
    }

    // FIXED: Add proper login processing with role-based redirection
    @PostMapping("/login")
    public String processLogin(@RequestParam("username") String username,
                             @RequestParam("password") String password,
                             Model model) {
        User user = userService.getUserByUsername(username);
        
        if (user != null && user.getPassword().equals(password)) {
            // Role-based redirection
            if (user.getRole() == Role.ADMIN) {
                return "redirect:/admin/dashboard";
            } else if (user.getRole() == Role.INSTRUCTOR) {
                return "redirect:/instructor/dashboard";
            } else {
                return "redirect:/student/dashboard";
            }
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String processRegister(@ModelAttribute("user") User user, Model model) {
        if (userService.getUserByUsername(user.getUsername()) != null) {
            model.addAttribute("error", "Username already exists");
            return "register";
        }

        if (userService.getUserByEmail(user.getEmail()) != null) {
            model.addAttribute("error", "Email already exists");
            return "register";
        }

        user.setRole(Role.STUDENT);
        user.setEnabled(true);
        userService.saveUser(user);
        return "redirect:/login";
    }

    // FIXED: Remove generic dashboard - use role-specific ones
    @GetMapping("/dashboard")
    public String redirectToRoleDashboard() {
        // This will redirect to appropriate dashboard based on user role
        // In real app, you'd get current user from session
        return "redirect:/login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }
}
