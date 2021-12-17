package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.DAO.UserDAO;
import com.java.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserDAO userDao;

	public int userReistration(User user) {
		System.out.println("user service"+user);
		
		return userDao.userReistration(user);
	}

	@Override
	public List<User> verifyUser(String username, String password) {
		// TODO Auto-generated method stub
		return userDao.verifyUser(username, password);
	}

	

}
