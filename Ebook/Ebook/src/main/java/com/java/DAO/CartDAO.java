package com.java.DAO;

import java.util.ArrayList;

import com.java.DTO.CartDTO;

public interface CartDAO {
	public int AddToCart(CartDTO cartdto);

	public int getNextUserid();

	public ArrayList<CartDTO> getAllCartItemsbyUserID(int userid);

	public void deleteItem(int itemid, int userid);

}
