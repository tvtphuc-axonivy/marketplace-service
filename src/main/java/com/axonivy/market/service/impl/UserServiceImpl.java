package com.axonivy.market.service.impl;

import com.axonivy.market.entity.User;
import com.axonivy.market.repository.UserRepository;
import lombok.extern.log4j.Log4j2;

import org.springframework.stereotype.Service;
import java.util.List;


@Service
@Log4j2
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
