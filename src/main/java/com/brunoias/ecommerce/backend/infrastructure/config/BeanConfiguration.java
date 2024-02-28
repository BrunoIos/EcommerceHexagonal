package com.brunoias.ecommerce.backend.infrastructure.config;

import com.brunoias.ecommerce.backend.application.UserService;
import com.brunoias.ecommerce.backend.domain.port.IUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public UserService userService(IUserRepository iUserRepository) {
        return new UserService(iUserRepository);
    }
}
