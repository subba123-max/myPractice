package com.java.service;

import java.util.ArrayList;

import com.java.DTO.ProductDTO;

public interface Productservice {
	public int insertBook(ProductDTO productdto);

	public ArrayList<ProductDTO> getAllBooks();

	public ProductDTO getBookByID(int bookid);

	public boolean UpdateBook(ProductDTO productdto);

	public void DeleteBook(int bookid);

}
