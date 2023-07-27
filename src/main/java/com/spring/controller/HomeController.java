package com.spring.controller;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.User;
import com.spring.service.UserService;

@RestController
@RequestMapping("/home")
//authenticated user can access data
public class HomeController {

	Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private UserService userService;
	
	@RequestMapping("/user")
	public List<User> test() {
		logger.warn("This is working message");
		return userService.getUsers();
	}

	@GetMapping("current-user")
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
	}
}