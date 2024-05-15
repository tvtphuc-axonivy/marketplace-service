package com.marketplaceservice.service.impl;

import com.marketplaceservice.entity.User;
import com.marketplaceservice.repository.UserRepository;
import com.marketplaceservice.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
