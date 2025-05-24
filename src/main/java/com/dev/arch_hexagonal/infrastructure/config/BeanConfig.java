package com.dev.arch_hexagonal.infrastructure.config;

import com.dev.arch_hexagonal.domain.adapter.UserServiceImpl;
import com.dev.arch_hexagonal.domain.ports.repository.UserRepositoryPort;
import com.dev.arch_hexagonal.domain.ports.service.UserServicePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    UserServicePort userServicePort(UserRepositoryPort userRepositoryPort) {
        return new UserServiceImpl(userRepositoryPort);
    }
}
