package com.example.demo.validate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import com.example.demo.anotation.ValidateName;

public class NameValidator implements ConstraintValidator<ValidateName, String> {
    @Override
    public void initialize(ValidateName constraintAnnotation) {}

    @Override
    public boolean isValid(String name, ConstraintValidatorContext context) {
        return name != null && name.matches("^[A-Z][a-zA-Z]{2,}$");
    }
}