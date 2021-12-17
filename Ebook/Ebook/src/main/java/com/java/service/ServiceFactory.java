package com.java.service;

public class ServiceFactory {
	public static Userservise userservice;
	public static Productservice productservice;
	public static CartService cartservice;
	static {
		userservice = new UserserviceImpl();
		productservice = new ProductserviceImpl();
		cartservice = new CartServiceImpl();

	}

	public static Productservice getProductservice() {
		return productservice;
	}

	public static Userservise getUserservice() {
		return userservice;
	}

	public static CartService getCartservice() {
		return cartservice;
	}

}
