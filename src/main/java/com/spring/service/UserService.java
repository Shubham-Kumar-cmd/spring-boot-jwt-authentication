package com.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.spring.model.User;

@Service
public class UserService {
	private List<User> store =new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"Shubham1","shubham1@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Shubham2","shubham2@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Shubham3","shubham3@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Shubham4","shubham4@gmail.com"));
	}
	
	public List<User> getUsers(){
		return store;
	}
}
