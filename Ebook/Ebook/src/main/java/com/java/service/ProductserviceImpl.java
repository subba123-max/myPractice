package com.java.service;

import java.util.ArrayList;

import com.java.DAO.*;
import com.java.DTO.ProductDTO;

public class ProductserviceImpl implements Productservice {

	public int insertBook(ProductDTO productdto) {
		ProductDAO dao = DAOFactory.getProductDAO();
		int id = dao.getNextUserid();
		productdto.setId(id);

		int x = dao.insertBook(productdto);
		return x;
	}

	@Override
	public ArrayList<ProductDTO> getAllBooks() {
		ProductDAO dao = DAOFactory.getProductDAO();
		ArrayList<ProductDTO> productDTO = dao.getAllBooks();
		return productDTO;
	}

	@Override
	public ProductDTO getBookByID(int bookid) {
		ProductDAO dao = DAOFactory.getProductDAO();
		ProductDTO productdto = dao.getBookById(bookid);
		return productdto;
	}

	@Override
	public boolean UpdateBook(ProductDTO productdto) {
		ProductDAO dao = DAOFactory.getProductDAO();
		boolean status = dao.UpdateBook(productdto);
		return status;
	}

	@Override
	public void DeleteBook(int bookid) {
		ProductDAO dao = DAOFactory.getProductDAO();

		dao.DeleteBook(bookid);
	}

}
