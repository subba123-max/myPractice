package com.java.DAO;

import com.java.DTO.ProductDTO;
import com.java.DTO.UsersDTO;

public interface DAO {
	public int userRegistration(UsersDTO usersdto);
	public int getNextUserid();
	public UsersDTO verifyUser(String username,String password);
	public UsersDTO getuserbyuserid(int userid);
	public boolean updateprofile(UsersDTO userdto);

}
