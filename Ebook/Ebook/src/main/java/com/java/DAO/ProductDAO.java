package com.java.DAO;

import java.util.ArrayList;

import com.java.DTO.ProductDTO;

public interface ProductDAO {
	public int insertBook(ProductDTO productdto);

	public int getNextUserid();

	public ArrayList<ProductDTO> getAllBooks();

	public ProductDTO getBookById(int bookid);

	public boolean UpdateBook(ProductDTO productdto);

	public void DeleteBook(int bookid);

}
