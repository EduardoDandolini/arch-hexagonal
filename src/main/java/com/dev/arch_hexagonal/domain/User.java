package com.dev.arch_hexagonal.domain;

import com.dev.arch_hexagonal.domain.dto.UserDTO;

public class User {

    private Long id;
    private String cpf;

    public User() {

    }

    public User(Long id, String cpf) {
        this.id = id;
        this.cpf = cpf;
    }

    public User(UserDTO dto) {
        this.cpf = dto.cpf();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
