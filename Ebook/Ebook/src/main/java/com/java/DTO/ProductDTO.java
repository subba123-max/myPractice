package com.java.DTO;

public class ProductDTO {
	int id;
	String name;
	String price;
	String description;
	String image;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public ProductDTO(int id, String name, String price, String description, String image) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.image = image;
	}

	public ProductDTO() {
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", image=" + image + "]";
	}

}
