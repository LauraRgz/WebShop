package com.nebrija.tpra;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
	
	public void showMenu (){
		Locale locale2 = new Locale("en", "EN");
		Internationalization message = new Internationalization(locale2);
		System.out.println("-----------------------");
		System.out.println(message.getMessages("option1", locale2));
		System.out.println(message.getMessages("option2", locale2));
		System.out.println(message.getMessages("option3", locale2));
		System.out.println(message.getMessages("option4", locale2));
		System.out.println(message.getMessages("option5", locale2));
		System.out.println(message.getMessages("option6", locale2));
		System.out.println(message.getMessages("option7", locale2));
		System.out.println(message.getMessages("option8", locale2));	
		System.out.println("-----------------------");
	}
	
	public void mostrarMenu() {
		Locale locale1 = new Locale("es", "ES");
		Internationalization message = new Internationalization(locale1);
		System.out.println("-----------------------");
		System.out.println(message.getMessages("option1", locale1));
		System.out.println(message.getMessages("option2", locale1));
		System.out.println(message.getMessages("option3", locale1));
		System.out.println(message.getMessages("option4", locale1));
		System.out.println(message.getMessages("option5", locale1));
		System.out.println(message.getMessages("option6", locale1));
		System.out.println(message.getMessages("option7", locale1));
		System.out.println(message.getMessages("option8", locale1));	
		System.out.println("-----------------------");
	}

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
	 
	 int languageSelector;
	 System.out.println("Select language: 1 = English, 2 = Español, 3 = Italiano");
	 System.out.println("Enter an option");
	 languageSelector = entrada.nextInt();
	
	 
	  do{
		 System.out.println(" ");
		 if (languageSelector == 1) {
			 menu.showMenu();
		 }
		 else if(languageSelector == 2) {
			 menu.mostrarMenu();
		 }
		 
		 System.out.println("Enter an option");
		 selector = entrada.nextInt();
		
		 if(selector == 1){
			 System.out.println("Product name"); 
			 boolean found = false;
			 String nombre = entrada.nextLine();
			 nombre = entrada.nextLine();
		
			 for(int i = 0; i < list1.size();i++) {
				 if(nombre.equals(list1.get(i).getName())) {
					 found = true;
					 list1.get(i).showProduct();
					 break;
				 } 
				
			 }
			 
			if (!found) {
				System.out.println("Product not found");
				 
			}
		 }
		
		 
		 else if (selector == 2) {
			 System.out.println("Category"); 
			 boolean found = false;
			 Scanner input = new Scanner(System.in);
			 String categoria = input.nextLine();
			 for(int i = 0; i < list1.size(); i++) {
				 if(categoria.equals(list1.get(i).getCategoryProduct())) {
					 list1.get(i).showProduct();
					 found = true;
				 } 
			 }
			 if(!found) {
				 System.out.println("Category not found");
			 }
		 }
		 
		 else if(selector == 3) {
			 int i = 0;
			 while (i < list1.size()) {
				 list1.get(i).showProduct();
				 i++;
			 }
		 }
		 
		 else if (selector == 4) {
			 String email;
			 String username;
			 String password;
			
			 System.out.println("Enter an email: ");
			 email = entrada.nextLine();
			 entrada.nextLine();
			 System.out.println("Enter an username: ");
			 username = entrada.nextLine();
			 
			 System.out.println("Enter a password: ");
			 password = entrada.nextLine();
			 
			 
			 User user1 = new User(email, username, password);
			 list2.addUser(user1);
			 System.out.println(" ");
		 }
		 
		 else if (selector == 5) {
			 System.out.println("Product name "); 
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
				aux.showProduct();
				 
		}
	 }
	 while (selector != 0);
 }
}
