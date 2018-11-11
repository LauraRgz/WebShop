package com.nebrija.tpra;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ProductList {
	
	ArrayList <Product> lista = new ArrayList<Product>();
	Product productToList = new Product();
	

	public void addProduct (Product productToList) {
		lista.add(productToList);
		File file = new File("./ProductList.txt");
		FileOutputStream fos = null;
		try {
		
			fos = new FileOutputStream("./ProductList.txt", true);
						
			fos.write(productToList.getName().getBytes());
		
			fos.write(String.valueOf(productToList.getId()).getBytes());
		
			fos.write(String.valueOf(productToList.getPrize()).getBytes());
			
			fos.write(String.valueOf(productToList.getStock()).getBytes());
			
			fos.write(productToList.getCategoryProduct().getBytes());
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				file.deleteOnExit();
			}
			catch (Exception e) {
				
			}
		}
		
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
