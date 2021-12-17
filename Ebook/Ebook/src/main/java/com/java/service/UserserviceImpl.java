package com.java.service;

import com.java.DTO.UsersDTO;
import com.java.DAO.*;

public class UserserviceImpl implements Userservise {

	@Override
	public int userRegistration(UsersDTO usersdto) {
		// TODO Auto-generated method stub
		DAO dao = DAOFactory.getUserDAO();
		int userid = dao.getNextUserid();
		usersdto.setUserid(userid);
		int x = dao.userRegistration(usersdto);

		return x;
	}

	@Override
	public UsersDTO verifyUser(String username, String password) {
		// TODO Auto-generated method stub
		DAO dao = DAOFactory.getUserDAO();
		UsersDTO usersdto = dao.verifyUser(username, password);

		return usersdto;
	}

	@Override
	public UsersDTO getuserbyuserid(int userid) {
		DAO dao = DAOFactory.getUserDAO();
		UsersDTO userdto = dao.getuserbyuserid(userid);
		return userdto;
	}

	@Override
	public boolean updateprofile(UsersDTO userdto) {
		// TODO Auto-generated method stub
		DAO dao = DAOFactory.getUserDAO();
		boolean status = dao.updateprofile(userdto);
		return status;
	}

}
