package com.dev.arch_hexagonal.infrastructure.adapter.repository;

import com.dev.arch_hexagonal.domain.User;
import com.dev.arch_hexagonal.domain.ports.repository.UserRepositoryPort;
import com.dev.arch_hexagonal.infrastructure.adapter.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserRepository implements UserRepositoryPort {

    private final SpringUserRepository springUserRepository;

    public UserRepository(SpringUserRepository springUserRepository) {
        this.springUserRepository = springUserRepository;
    }

    @Override
    public void save(User user) {
       UserEntity entity = new UserEntity(user);
       this.springUserRepository.save(entity);
    }
}
