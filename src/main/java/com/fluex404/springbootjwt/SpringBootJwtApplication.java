package com.fluex404.springbootjwt;

import com.fluex404.springbootjwt.model.ERole;
import com.fluex404.springbootjwt.model.Role;
import com.fluex404.springbootjwt.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringBootJwtApplication implements ApplicationRunner {

	@Autowired
	private RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<Role> roles = Arrays.asList(
				new Role(ERole.ROLE_MODERATOR),
				new Role(ERole.ROLE_USER),
				new Role(ERole.ROLE_ADMIN)
		);
		roleRepository.saveAll(roles);
	}
}
