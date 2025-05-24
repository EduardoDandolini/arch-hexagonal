package com.dev.arch_hexagonal.domain.ports.service;

import com.dev.arch_hexagonal.domain.User;
import com.dev.arch_hexagonal.domain.dto.UserDTO;

public interface UserServicePort {

    void save(UserDTO userDTO);

}
