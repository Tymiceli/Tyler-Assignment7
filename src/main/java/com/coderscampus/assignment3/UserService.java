package com.coderscampus.assignment3;

public class UserService {
  
	public User isValidUser(String username, String password) {
		for (User user : Assignment3.users) {
			if (user.getUsername().equalsIgnoreCase(username) &&
					user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
}
