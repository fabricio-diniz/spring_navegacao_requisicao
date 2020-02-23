package com.spring.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value = "user/{name}", method = RequestMethod.GET)
	public List<User> getUser(@PathVariable String name) {
		List<User> users = new ArrayList<>();
		
		User user = new User("Fabricio", "fabricio_diniz@outlook.com");
		User user2 = new User(name, "kamyla_diniz@outlook.com");
		
		users.add(user);
		users.add(user2);
		
		return users;
	}
	
	@RequestMapping(value = "user", method = RequestMethod.POST)
	public User setUser(@RequestBody User user) {
		return user;
	}
}
