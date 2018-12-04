package com.nebrija.tpra;

import java.io.FileInputStream;
import java.util.Scanner;

public class MenuFunction {
	
	 Scanner entrada = new Scanner(System.in);
	 
	 ProductList list1 = new ProductList();
	 UserList list2 = new UserList();
	 Product aux = new Product();
	 
	 public void option1() {
		 boolean found = false;
		 System.out.println("Enter a name");
		 String nombre = entrada.nextLine();
		 nombre = entrada.nextLine();
		 for(int i = 0; i < list1.size();i++) {
			 if(nombre.equals(list1.get(i).getName())) {
				 found = true;
					 list1.get(i).showProduct();
					 break;
			 }
			 if (!found) {
				 System.out.println("Product not found");
			 }
		 }
	 }
	 public void option2() {
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
			 
			 System.out.println("Category not found");;
			 }
	 	}
	 public void option3() {
		 int i = 0;
		 while (i < list1.size()) {
			list1.get(i).showProduct(); 
		 }
			 i++;
	}

	 public void option4() {
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
	 
	 public void option5() {
		 System.out.println("Enter the product name: ");
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
	 
	 public void option6() {
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
	 
	public void option7() {
		aux = list1.get(list1.size()-1);
		 	 aux.showProduct();
		
	}
	 
	
	public static void main(String[] args) {
	

	}

}
