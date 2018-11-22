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
	
	public void mostrareMenu() {
		Locale locale3 = new Locale("it", "IT");
		Internationalization message = new Internationalization(locale3);
		System.out.println("-----------------------");
		System.out.println(message.getMessages("option1", locale3));
		System.out.println(message.getMessages("option2", locale3));
		System.out.println(message.getMessages("option3", locale3));
		System.out.println(message.getMessages("option4", locale3));
		System.out.println(message.getMessages("option5", locale3));
		System.out.println(message.getMessages("option6", locale3));
		System.out.println(message.getMessages("option7", locale3));
		System.out.println(message.getMessages("option8", locale3));	
		System.out.println("-----------------------");
	}
}
	
	

