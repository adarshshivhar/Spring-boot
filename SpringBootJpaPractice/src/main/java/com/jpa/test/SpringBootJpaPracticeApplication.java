package com.jpa.test;

import java.util.List;
import java.util.Optional;

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
		
		//Single user save
//		User user = new User();
//		
//		user.setName("Adarsh Shivhare");
//		user.setCity("Korba");
//		user.setStatus("I am a programmer");
//		
//		User user1 = userRepository.save(user);
//		
//		System.out.println(user1);
		
		//Save Multiple user 
//		User user1 = new User();
//		
//		user1.setName("Akanksha Dewangan");
//		user1.setCity("Durg");
//		user1.setStatus("I am a Python Programmer");
//		
//		User user2 = new User();
//		
//		user2.setName("XYZ");
//		user2.setCity("ABC");
//		user2.setStatus("I am a Python Programmer");
//		
//		
//		List<User> users =  List.of(user1, user2);
//		Iterable<User> result = userRepository.saveAll(users);
//		
//		result.forEach(user -> {
//			System.out.println(user);
//		});
		
		//Update user by id 6
//		Optional<User> optional = userRepository.findById(6);
//		User user = optional.get();
//		user.setName("ZYX");
//		User result = userRepository.save(user);
//		System.out.println(result);
		
		//How to get the data
		//findById(id) - return optional containing your data
//		Optional<User> singleUser = userRepository.findById(6);
//		User user = singleUser.get();
//		System.out.println(user);
		
		//findAll()
//		Iterable<User> itr = userRepository.findAll();
//		itr.forEach(user1 -> System.out.println(user1));
		
		//Delete user by id
//		userRepository.deleteById(6);
		
		//Print users
//		Iterable<User> itr = userRepository.findAll();
//		itr.forEach(user1 -> System.out.println(user1));
		
		//Custom Finder methods or Derived Query methods
//		List<User> results = userRepository.findByName("Adarsh Shivhare");
//		results.forEach(user -> System.out.println(user));
		
		List<User> results = userRepository.findByNameAndCity("Adarsh Shivhare", "Korba");
		results.forEach(user -> System.out.println(user));
	}

}
