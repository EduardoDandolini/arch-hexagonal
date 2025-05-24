package com.dev.arch_hexagonal;

import com.dev.arch_hexagonal.infrastructure.adapter.repository.SpringUserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = SpringUserRepository.class)
public class ArchHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchHexagonalApplication.class, args);
	}

}
