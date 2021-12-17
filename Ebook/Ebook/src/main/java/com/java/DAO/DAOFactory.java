package com.java.DAO;

import com.java.DTO.ProductDTO;

public class DAOFactory {
	public static  DAO UserDAO;
	public static ProductDAO productDAO;
	public static CartDAO cartDAO;
	
	static{
		UserDAO=new DAOImpl();
		productDAO=new ProductDAOImpl();
		cartDAO=new CartDAOImpl();
	}
	public static ProductDAO getProductDAO() {
		return productDAO;
	}
	
	public static DAO getUserDAO() {
		return UserDAO;
	}
	public static CartDAO getCartDAO() {
		return cartDAO;
	}
	
	
}
