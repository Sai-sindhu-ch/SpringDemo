package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
	User create(User user);
	User deleteById(int id);
	User retrieveByNameAndGender(String name, String gender);
	void updateName(String name, int id);
	
}
