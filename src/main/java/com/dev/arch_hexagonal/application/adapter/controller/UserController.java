package com.dev.arch_hexagonal.application.adapter.controller;

import com.dev.arch_hexagonal.domain.dto.UserDTO;
import com.dev.arch_hexagonal.domain.ports.service.UserServicePort;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserServicePort userServicePort;

    public UserController(UserServicePort userServicePort) {
        this.userServicePort = userServicePort;
    }

    @PostMapping
    void save(@RequestBody UserDTO dto) {
        userServicePort.save(dto);
    }

}
