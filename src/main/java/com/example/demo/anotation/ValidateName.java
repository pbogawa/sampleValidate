package com.example.demo.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import com.example.demo.validate.NameValidator;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NameValidator.class)
public @interface ValidateName {
    String message() default "Invalid name: must start with uppercase and be at least 3 characters long";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}