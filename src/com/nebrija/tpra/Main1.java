package com.nebrija.tpra;

import java.io.FileReader;
import java.util.Properties;


public class Main1 {

	public static void main(String[] args) {
		
		try(FileReader reader =  new FileReader("config")) {
			Properties properties = new Properties();
			properties.load(reader); 
		    String username = properties.getProperty("username");
			String email = properties.getProperty("email");
		    String password = properties.getProperty("password");

		    System.out.println(username);
		    System.out.println(email);
		    System.out.println(password);
		 }
		catch (Exception e) {;
		 	e.printStackTrace();
		 }
		


	}

}