package com.example.demo.entity;

import com.example.demo.anotation.ValidateName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserEntity {
    @ValidateName
    private String name;



}