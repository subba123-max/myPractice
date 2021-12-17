package com.java.service;

import java.util.ArrayList;

import com.java.DAO.CartDAO;
import com.java.DAO.DAO;
import com.java.DAO.DAOFactory;
import com.java.DTO.CartDTO;

public class CartServiceImpl implements CartService {

	@Override
	public int AddToCart(CartDTO cartdto) {

		CartDAO dao = DAOFactory.getCartDAO();
		int id = dao.getNextUserid();
		System.out.println("id:" + id);
		cartdto.setId(id);
		int x = dao.AddToCart(cartdto);

		return x;
	}

	@Override
	public ArrayList<CartDTO> getAllCartItemsbyUserID(int userid) {
		// TODO Auto-generated method stub
		CartDAO dao = DAOFactory.getCartDAO();
		ArrayList<CartDTO> items = dao.getAllCartItemsbyUserID(userid);

		return items;
	}

	@Override
	public void deleteItem(int itemid, int userid) {
		CartDAO dao = DAOFactory.getCartDAO();
		dao.deleteItem(itemid, userid);
	}

}
