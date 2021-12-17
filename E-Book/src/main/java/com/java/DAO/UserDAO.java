package com.java.DAO;

import java.util.List;

import com.java.model.User;

public interface UserDAO {
	
	public int userReistration(User user);
	public List<User> verifyUser(String username ,String password) ;

}
