package com.example.demo.validate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import com.example.demo.annotation.ValidateName;

public class NameValidator implements ConstraintValidator<ValidateName, String> {
    @Override
    public void initialize(ValidateName constraintAnnotation) {}

    @Override
    public boolean isValid(String name, ConstraintValidatorContext context) {
        return  name.matches("^[A-Z]");
    }
}