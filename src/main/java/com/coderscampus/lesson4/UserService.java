package com.coderscampus.lesson4;

import com.coderscampus.lesson3.User;

public class UserService {

	public User createUser (String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setFirstName("John");
		user.setLastName("Doe");
		return user;
	}
}
