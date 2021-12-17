package com.java.DTO;

public class CartDTO {

	private int id;
	private int bookid;
	private int userid;
	private String bookName;
	private double price;
	private double totalprice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	@Override
	public String toString() {
		return "CartDTO [id=" + id + ", bookid=" + bookid + ", userid=" + userid + ", bookName=" + bookName + ", price="
				+ price + ", totalprice=" + totalprice + "]";
	}

}
