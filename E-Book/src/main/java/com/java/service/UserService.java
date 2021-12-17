package com.java.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.model.User;

//@Service
public interface UserService {
	public int userReistration(User user);
	
	public List<User> verifyUser(String username ,String password) ;

}
