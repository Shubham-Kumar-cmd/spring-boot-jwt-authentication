package com.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.model.User;
import com.spring.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	 @Autowired
     private PasswordEncoder passwordEncoder;
	
//	private List<User> store =new ArrayList<>();
	
	public UserService() {
//		store.add(new User(UUID.randomUUID().toString(),"Shubham1","shubham1@gmail.com",));
//		store.add(new User(UUID.randomUUID().toString(),"Shubham2","shubham2@gmail.com"));
//		store.add(new User(UUID.randomUUID().toString(),"Shubham3","shubham3@gmail.com"));
//		store.add(new User(UUID.randomUUID().toString(),"Shubham4","shubham4@gmail.com"));
	}
	
	public List<User> getUsers(){
		List<User> findAll = userRepository.findAll();
		return findAll;
//		return store;
	}
	
	public User createUser(User user) {
		user.setUserId(UUID.randomUUID().toString());
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}
}
