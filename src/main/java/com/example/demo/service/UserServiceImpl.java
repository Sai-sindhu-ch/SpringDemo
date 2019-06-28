/**
 * 
 */
package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
/**
 * 
 * @author sindhu
 * this class is used to implement the methods of userService interface
 */
@Service("userService")

public class UserServiceImpl implements UserService {
	@Autowired
	UserRepo userRepo;
	List<User> li = new ArrayList<>();
	/**
	 * this method is used to retrieve user details using name and gender
	 */
	@Override
	public User retrieveByNameAndGender(String name,String gender) {
		return userRepo.retrieveByNameAndGender(name, gender);
	}
	/**
	 * this method is used to create new user
	 */
	@Override
	public User create(User user) {
		return userRepo.save(user);
	}
	/**
	 * this method is used to update user name using user id
	 */
	@Override
	public void updateName(String name,int id) {
		 userRepo.updateName(name, id);
		
	}
	/**
	 * this method is used to delete user using user id
	 */
	@Override
	public User deleteById(int id) {
		userRepo.deleteById(id);
		return null;
	}
}