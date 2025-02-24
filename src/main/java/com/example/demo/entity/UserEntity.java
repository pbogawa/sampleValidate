package com.example.demo.entity;

import jakarta.validation.constraints.NotBlank;

import com.example.demo.annotation.ValidateName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserEntity {
    @ValidateName
    @NotBlank(message = "Name cannot be blank")
    private String name;



}