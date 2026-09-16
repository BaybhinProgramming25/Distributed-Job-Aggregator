package com.example.dto;

public record SignupRequest(
    String username,
    String email,
    String password,
    String phoneNumber
) {}
