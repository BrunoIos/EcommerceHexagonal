package com.brunoias.ecommerce.backend.application;

import com.brunoias.ecommerce.backend.domain.model.User;
import com.brunoias.ecommerce.backend.domain.port.IUserRepository;

public class UserService {
    private final IUserRepository userRepository;


    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return this.userRepository.save(user);
    }

    public User findById(Integer id) {
        return this.userRepository.findById(id);
    }
}
