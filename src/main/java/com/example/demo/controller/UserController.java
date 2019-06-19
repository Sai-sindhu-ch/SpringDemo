package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

@RestController
public class UserController {
//	@RequestMapping
//	public String Check() {
//		return "hello world";
	//}
	@RequestMapping("/User")
	public User check() {
		User user = new User("female","sindhu");
		return user;
	}
}
