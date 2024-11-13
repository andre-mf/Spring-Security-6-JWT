package com.andre.springsecurity.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn ) {
}
