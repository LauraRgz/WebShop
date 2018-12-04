package com.nebrija.tpra;

import java.io.FileInputStream;
import java.util.Locale;
import java.util.Scanner;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {

	 


	public static void main(String[] args) throws Exception {
		 
		 ProductList list1 = new ProductList();
		 UserList list2 = new UserList();
		 Product aux = new Product();

		 
		 Product libro1 = new Product(2.0, "libro1", 3, 4.5, "Books");
		 Product libro2 = new Product(7.0, "libro2", 8, 9.5, "Books");
		 Product libro3 = new Product(7.0, "libro3", 8, 9.5, "Books");
		 
		 list1.addProduct(libro1);
		 list1.addProduct(libro2);
		 list1.addProduct(libro3);
		 
		 Product film1 = new Product(4.0, "Film1", 7, 7.9, "Films");
		 Product film2 = new Product(7.0, "Film2", 6, 5.3, "Films");
		 Product film3 = new Product(6.0, "Film3", 9, 8.5, "Films");
		 
		 list1.addProduct(film1);
		 list1.addProduct(film2);
		 list1.addProduct(film3);
		 
		 Product cd1 = new Product (7.0, "cd1", 9, 8.0, "Music");
		 Product cd2 = new Product (7.0, "cd2", 9, 8.0, "Music");
		 Product cd3 = new Product (7.0, "cd3", 9, 8.0, "Music");
		 
		 list1.addProduct(cd1);
		 list1.addProduct(cd2);
		 list1.addProduct(cd3);
		 
		
		 
		 Interface.inicio();

	}
}
