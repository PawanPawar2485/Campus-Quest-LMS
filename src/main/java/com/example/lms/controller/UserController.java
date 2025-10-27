package com.example.lms.controller;

import com.example.lms.entity.User;
import com.example.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // FIXED: Remove duplicate login methods - use AuthController instead
    // Only keep user management functionality

    // REST API endpoints for users
    @RestController
    @RequestMapping("/api/users")
    public static class UserApiController {
        
        @Autowired
        private UserService userService;

        @GetMapping
        public List<User> getAllUsers() {
            return userService.getAllUsers();
        }

        @GetMapping("/{id}")
        public Optional<User> getUserById(@PathVariable Long id) {
            return userService.getUserById(id);
        }

        @PostMapping
        public User createUser(@RequestBody User user) {
            return userService.saveUser(user);
        }

        @DeleteMapping("/{id}")
        public void deleteUser(@PathVariable Long id) {
            userService.deleteUser(id);
        }
    }
}
