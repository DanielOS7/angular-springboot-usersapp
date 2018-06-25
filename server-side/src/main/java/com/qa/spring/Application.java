package com.qa.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired	
	private UserRepository userRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("Mark", "Johnson", "10040001"));
		userRepository.save(new User("Ben", "Robinson", "10040002"));
		userRepository.save(new User("Daniel", "Clarkson", "10040003"));
		
	}
}
