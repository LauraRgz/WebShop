package com.nebrija.tpra;

import java.util.ArrayList;

public class ProductList {
	
	ArrayList <Product> lista = new ArrayList<Product>();
	Product productToList = new Product();
	

	public void addProduct (Product productToList) {
		lista.add(productToList);
	}
	
	public void deleteProduct(Product productToList) {
		lista.remove(productToList);
	}

	public Product get(int i) {
		return this.lista.get(i);
	}
	
	public int size() {
		return lista.size();
	}
}
