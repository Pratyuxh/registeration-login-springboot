package com.pratyush.backend.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import com.pratyush.backend.model.User;
import com.pratyush.backend.web.DTO.UserRegistrationDto

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}