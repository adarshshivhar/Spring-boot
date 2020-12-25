package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.modal.User;

@SpringBootApplication
public class SpringBootJpaPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringBootJpaPracticeApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user = new User();
		
		user.setName("Adarsh Shivhare");
		user.setCity("Korba");
		user.setStatus("I am a programmer");
		
		User user1 = userRepository.save(user);
		
		System.out.println(user1);
	}

}
