/**
 * 
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

/**
 * 
 * @author sindhu
 * UserController class
 */
@RestController
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping("/")
	public String check() {
		return "hello world";
	}
	
	/**
	 * 
	 * @param name
	 * @param gender
	 * @return user by using name and gender
	 */
	@GetMapping("/User/{name}/{gender}")
	public User retrieveByNameAndGender(@PathVariable("name") String name,@PathVariable("gender")String gender) {
		return userService.retrieveByNameAndGender(name,gender);
	}
	/**
	 * 
	 * @param user
	 * @return user
	 */
	@PostMapping("/User")
	public User postMethod(@RequestBody User user) {
		return userService.create(user);
	}
	/**
	 * 
	 * @param name
	 * @param id
	 */
	@PutMapping("/User/{name}/{id}")
	public void updateName(@PathVariable("name") String name,@PathVariable("id") int id) {
		 userService.updateName(name,id);
	}
	/**
	 * 
	 * @param id
	 * @return 
	 */
	@DeleteMapping("/User/{id}")
	public User deleteById(@PathVariable int  id) {
		return userService.deleteById(id);
	}
}
