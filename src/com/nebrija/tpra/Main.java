package com.nebrija.tpra;

import java.io.FileInputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 int selector;
		 
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
		 
		 Menu menu = new Menu();
		 Product auxProduct = new Product();
		 
		 int languageSelector;
		 System.out.println("Language");
		 System.out.println("1 = English, 2 = Español, 3 = Italiano\"");
		 System.out.println("Enter an option");
		 languageSelector = entrada.nextInt();
		
		 Locale locale1 = new Locale("en", "EN");
		 Internationalization message1 = new Internationalization(locale1);
		 Locale locale2 = new Locale("es", "ES");
		 Internationalization message2 = new Internationalization(locale2);
		 Locale locale3 = new Locale("it", "IT");
		 Internationalization message3 = new Internationalization(locale3);
		 
		  do{
			  
			 System.out.println(" ");
			 if (languageSelector == 1) {
				menu.showMenu(); 
				System.out.println(message1.getMessages("selector", locale1));
			 }
			 else if(languageSelector == 2) {
				menu.mostrarMenu();
				System.out.println(message2.getMessages("selector", locale2));
			 }
			 else if (languageSelector == 3) {
				menu.mostrareMenu();
				System.out.println(message3.getMessages("selector", locale3));
			 }
			 
	
			 selector = entrada.nextInt();
			
			 if(selector == 1){
				 
				 if (languageSelector == 1) { 
					System.out.println(message1.getMessages("productName", locale1));
				 }
				 else if (languageSelector == 2) {
					System.out.println(message2.getMessages("productName", locale2));
				 }
				 else if (languageSelector == 3) {
					System.out.println(message3.getMessages("productName", locale3));
				}
				 
				 boolean found = false;
				 String nombre = entrada.nextLine();
				 nombre = entrada.nextLine();
			
				 for(int i = 0; i < list1.size();i++) {
					 if(nombre.equals(list1.get(i).getName())) {
						 found = true;
						 if (languageSelector == 1) {
							 list1.get(i).showProduct();
							 
						 }
						 else if(languageSelector == 2) {
							 list1.get(i).mostrarProduct();
						 }
						 else if (languageSelector == 3) {
							 list1.get(i).mostrareProduct();
						 }			 
						 
						 
						 break;
					 } 
					
				 }
				 
				if (!found) {
					
					if (languageSelector == 1) { 
						System.out.println(message1.getMessages("notFound", locale1));
					}
					else if (languageSelector == 2) {
						System.out.println(message2.getMessages("notFound", locale2));
					}
					else if (languageSelector == 3) {
						System.out.println(message3.getMessages("notFound", locale3));
					}			 
				}
			 }
			 
			 else if (selector == 2) {
				 
				 if (languageSelector == 1) { 
						System.out.println(message1.getMessages("category", locale1));
				 }
				 else if (languageSelector == 2) {
					 	System.out.println(message2.getMessages("category", locale2));
				 }
				 else if (languageSelector == 3) {
					 	System.out.println(message3.getMessages("category", locale3));
				 }
				 
				 boolean found = false;
				 Scanner input = new Scanner(System.in);
				 String categoria = input.nextLine();
				 for(int i = 0; i < list1.size(); i++) {
					 if(categoria.equals(list1.get(i).getCategoryProduct())) {
						 if (languageSelector == 1) {
							 list1.get(i).showProduct();
							 
						 }
						 else if(languageSelector == 2) {
							 list1.get(i).mostrarProduct();
						 }
						 else if (languageSelector == 3) {
							 list1.get(i).mostrareProduct();
						 }	
						 found = true;
					 } 
				 }
				 if(!found) {
					 if (languageSelector == 1) { 
						 System.out.println(message1.getMessages("notFoundC", locale1));
					 }
					 else if (languageSelector == 2) {
						 System.out.println(message2.getMessages("notFoundC", locale2));
					 }
					 else if (languageSelector == 3) {
						 System.out.println(message3.getMessages("notFoundC", locale3));
					 }
				 }
			 }
			 
			 else if(selector == 3) {
				 int i = 0;
				 while (i < list1.size()) {
					 if (languageSelector == 1) {
						 list1.get(i).showProduct();
						 
					 }
					 else if(languageSelector == 2) {
						 list1.get(i).mostrarProduct();
					 }
					 else if (languageSelector == 3) {
						 list1.get(i).mostrareProduct();
					 }	
					 
					 i++;
				 }
			 }
			 
			 else if (selector == 4) {
				 String email;
				 String username;
				 String password;
				
				 if (languageSelector == 1) {
					 System.out.println(message1.getMessages("email", locale1));
					 email = entrada.nextLine();
					 entrada.nextLine();
					 System.out.println(message1.getMessages("username", locale1));
					 username = entrada.nextLine();
					 System.out.println(message1.getMessages("password", locale1));
					 password = entrada.nextLine();
					 
					 User user1 = new User(email, username, password);
					 list2.addUser(user1);
					 System.out.println(" ");
					 
				 }
				 else if(languageSelector == 2) {
					 System.out.println(message2.getMessages("email", locale2));
					 email = entrada.nextLine();
					 entrada.nextLine();
					 System.out.println(message2.getMessages("username", locale2));
					 username = entrada.nextLine();
					 System.out.println(message2.getMessages("password", locale2));
					 password = entrada.nextLine();
					 
					 User user1 = new User(email, username, password);
					 list2.addUser(user1);
					 System.out.println(" ");
				 }
				 else if (languageSelector == 3) {
					 System.out.println(message3.getMessages("email", locale3));
					 email = entrada.nextLine();
					 entrada.nextLine();
					 System.out.println(message3.getMessages("username", locale3));
					 username = entrada.nextLine();
					 System.out.println(message3.getMessages("password", locale3));
					 password = entrada.nextLine();
					 
					 User user1 = new User(email, username, password);
					 list2.addUser(user1);
					 System.out.println(" ");
				}
				 

			 }
			 
			 else if (selector == 5) {
				 if (languageSelector == 1) { 
					System.out.println(message1.getMessages("productName", locale1));
				 }
				 else if (languageSelector == 2) {
					System.out.println(message2.getMessages("productName", locale2));
				 }
				 else if (languageSelector == 3) {
					System.out.println(message3.getMessages("productName", locale3));
				}
				String nombre;
				nombre = entrada.nextLine();
				entrada.nextLine();
			
				for(int i = 0; i < list1.size();i++) {
					 if(nombre.equals(list1.get(i).getName())) {
						 list1.get(i).showProduct();
						 list1.get(i).setStock(list1.get(i).getStock()-1);
					 } 
				 }
			 }
			 
			 else if (selector == 6) {
				 FileInputStream fis = null;
					try {
						fis = new FileInputStream("./AboutUs.txt");
						byte[] aboutUs = new byte[100];
						fis.read(aboutUs);		
						System.out.println(new String(aboutUs));
					}
					catch (Exception e){
						e.printStackTrace();
					}
					finally {
					}
			 }
			 
			 else if (selector == 7) {
					aux = list1.get(list1.size()-1);
					 if (languageSelector == 1) {
						 aux.showProduct();
						 
					 }
					 else if(languageSelector == 2) {
						 aux.mostrarProduct();
					 }
					 else if (languageSelector == 3) {
						 aux.mostrareProduct();
					 }
					 
			}
		 }
		 while (selector != 0);
	 }

}
