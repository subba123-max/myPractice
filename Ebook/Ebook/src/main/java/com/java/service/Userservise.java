package com.java.service;

import com.java.DTO.*;

public interface Userservise {
	public int userRegistration(UsersDTO usersdto);

	public UsersDTO verifyUser(String username, String password);

	public UsersDTO getuserbyuserid(int userid);

	public boolean updateprofile(UsersDTO userdto);
}
