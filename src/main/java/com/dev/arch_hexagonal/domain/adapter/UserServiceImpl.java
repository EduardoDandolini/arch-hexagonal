package com.dev.arch_hexagonal.domain.adapter;

import com.dev.arch_hexagonal.domain.User;
import com.dev.arch_hexagonal.domain.dto.UserDTO;
import com.dev.arch_hexagonal.domain.ports.repository.UserRepositoryPort;
import com.dev.arch_hexagonal.domain.ports.service.UserServicePort;

public class UserServiceImpl implements UserServicePort {

    private final UserRepositoryPort userRepositoryPort;

    public UserServiceImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public void save(UserDTO userDTO) {
        User user = new User(userDTO);
        this.userRepositoryPort.save(user);
    }

}
