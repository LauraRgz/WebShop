package com.nebrija.tpra;

import java.util.ArrayList;
import java.util.Locale;

class Product{
	private double id;
	private String name;
	private int stock;
	private double prize;
	private String categoryProduct;
	
	ArrayList <Product> lista = new ArrayList<Product>();
	
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
			Locale locale1 = new Locale("en", "EN");
			Internationalization message = new Internationalization(locale1);
			System.out.println(" ");
			
			System.out.println(message.getMessages("name", locale1) + " " + name);
			System.out.println(message.getMessages("id", locale1) + " " + id);
			System.out.println(message.getMessages("prize", locale1) + " " + prize + " £");
			System.out.println(message.getMessages("stock", locale1) + " " + stock);
			System.out.println(message.getMessages("category", locale1) + " " + categoryProduct);
		}
	}
	
	public void mostrarProduct() {
		if (this != null) {
			Locale locale2 = new Locale("es", "ES");
			Internationalization message = new Internationalization(locale2);
			System.out.println(" ");
			
			System.out.println(message.getMessages("name", locale2) + " " + name);
			System.out.println(message.getMessages("id", locale2) + " " + id);
			System.out.println(message.getMessages("prize", locale2) + " " + prize + " £");
			System.out.println(message.getMessages("stock", locale2) + " " + stock);
			System.out.println(message.getMessages("category", locale2) + " " + categoryProduct);
		}
	}
	
	public void mostrareProduct() {
		if (this != null) {
			Locale locale3 = new Locale("it", "IT");
			Internationalization message = new Internationalization(locale3);
			System.out.println(" ");
			
			System.out.println(message.getMessages("name", locale3) + " " + name);
			System.out.println(message.getMessages("id", locale3) + " " + id);
			System.out.println(message.getMessages("prize", locale3) + " " + prize + " £");
			System.out.println(message.getMessages("stock", locale3) + " " + stock);
			System.out.println(message.getMessages("category", locale3) + " " + categoryProduct);
		}
	}
	
	public Product thisLastProduct() {
		Product p = new Product();
		LastProduct lP = LastProduct.getLastProduct();
		if(!lista.isEmpty()) {
			p = lista.get(lista.size()-1);
		}else {
			p = null;
		}
		
		lP.setUltimoProducto(p);
		
		return p;
		
	}
}
