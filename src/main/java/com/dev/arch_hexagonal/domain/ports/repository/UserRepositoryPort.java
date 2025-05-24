package com.dev.arch_hexagonal.domain.ports.repository;

import com.dev.arch_hexagonal.domain.User;

public interface UserRepositoryPort {

    void save(User user);

}
