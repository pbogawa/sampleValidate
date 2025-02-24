package com.example.demo.controller;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserEntity;

@RestController
@RequestMapping("/users")
@Validated
public class UserController {
    @PostMapping("/create")
    public ResponseEntity<String> createUser(@Valid @RequestBody UserEntity user) {
        return ResponseEntity.ok("User created successfully: " + user.getName());
    }
}
