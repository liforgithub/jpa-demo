package com.example.jpa.jpademo.service;

import com.example.jpa.jpademo.entity.UserEntity;
import com.example.jpa.jpademo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> list() {
        return userRepository.findAll();
    }
}
