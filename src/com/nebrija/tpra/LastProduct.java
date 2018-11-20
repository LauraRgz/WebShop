package com.nebrija.tpra;

import java.util.ArrayList;

public class LastProduct {
	private static LastProduct lastProductAdded;
	private Product ultimoProducto;
	
	private LastProduct() {}
	
	ArrayList <Product> lista = new ArrayList<Product>();
	
	public static LastProduct getLastProduct() {
		if(lastProductAdded == null) {
			lastProductAdded = new LastProduct();
		}
		return lastProductAdded;
	}
	
	public void setUltimoProducto (Product ultimoProducto) {
		this.ultimoProducto = ultimoProducto;
		
	}
	
	public Product getUltimoProducto () {
		return ultimoProducto;
	}
}
