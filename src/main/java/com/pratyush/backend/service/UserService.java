package com.pratyush.backend.service;

import com.pratyush.backend.model.User;
import com.pratyush.backend.web.DTO.UserRegistration;

public interface UserService {
    User save(UserRegistration registeration);

}
