package com.java.service;

import java.util.ArrayList;

import com.java.DTO.CartDTO;

public interface CartService {
	public int AddToCart(CartDTO cartdto);

	public ArrayList<CartDTO> getAllCartItemsbyUserID(int userid);

	public void deleteItem(int itemid, int userid);

}
