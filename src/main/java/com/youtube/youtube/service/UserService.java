package com.youtube.youtube.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.youtube.youtube.repository.UserRepository;
import com.youtube.youtube.entity.User;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Long getUserDetails() {
        String email = "Rahul Sharma";
        Long user = userRepository.countByFullName(email);
        return user;
    }

}
// select u1_0.id,u1_0.created_at,u1_0.email,u1_0.full_name,u1_0.password,u1_0.updated_at from user u1_0 where u1_0.id=?