package com.pratyush.backend.service;

import com.pratyush.backend.model.Role;
import com.pratyush.backend.model.User;
import com.pratyush.backend.repository.UserRepository;
import com.pratyush.backend.web.DTO.UserRegistration;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistration registeration) {
        User user  = new User(registeration.getFirstName(), registeration.getLastName(),
                                registeration.getEmail(), registeration.getPassword(),
                Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }
}
