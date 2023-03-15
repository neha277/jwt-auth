package com.aubergenie.aubergenie.backend;

import com.aubergenie.aubergenie.backend.domain.Role;
import com.aubergenie.aubergenie.backend.domain.User;
import com.aubergenie.aubergenie.backend.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class AubergenieBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AubergenieBackendApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveRole(new Role(null,"ROLE_USER"));
			userService.saveRole(new Role(null,"ROLE_ADMIN"));
			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));



			userService.saveUser(new User(null,"neha","patil","neha@gmail.com","pcmc12345",new ArrayList<>()));

			userService.addRoleToUser("neha@gmail.com","ROLE_ADMIN");
		};
	}
}
