package com.peerlender.securityapp;

import com.peerlender.securityapp.user.model.User;
import com.peerlender.securityapp.user.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityappApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SecurityappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("tuan1","123"));
		userRepository.save(new User("tuan2","124"));
	}
}
