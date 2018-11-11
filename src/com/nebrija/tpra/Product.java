package com.nebrija.tpra;

import java.util.ArrayList;

public class Product{
	private double id;
	private String name;
	private int stock;
	private double prize;
	private String categoryProduct;
	
	public String getCategoryProduct() {
		return categoryProduct;
	}

	public void setCategoryProduct(String categoryProduct) {
		this.categoryProduct = categoryProduct;
	}

	public void setId(double id) {
		this.id = id;
	}

	Product(double id, String name, int stock, double prize, String categoryProduct){
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.prize = prize;
		this.categoryProduct = categoryProduct;
	}
	
	Product(String name){
		this.name = name;
	}
	
	Product(double id){
		this.id = id;
	}
	public Product() {}
	
	public double getId() {
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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	public void showProduct() {
		if (this != null) {
			System.out.println(" ");
			System.out.println("Name: " + name);
			System.out.println("ID: " + id);
			System.out.println("Prize: " + prize + " £");
			System.out.println("Stock: " + stock);
			System.out.println("Category: " + categoryProduct);
		}
	}
}
