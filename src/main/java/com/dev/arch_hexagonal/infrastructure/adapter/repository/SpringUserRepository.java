package com.dev.arch_hexagonal.infrastructure.adapter.repository;

import com.dev.arch_hexagonal.infrastructure.adapter.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringUserRepository extends JpaRepository<UserEntity, Long> {

}
