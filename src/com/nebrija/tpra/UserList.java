package com.nebrija.tpra;

import java.util.ArrayList;

public class UserList {

	ArrayList <User> lista = new ArrayList<User>();
	User userToList = new User();
	
	public void addUser (User userToList) {
		lista.add(userToList);
	}
	
	public User get(int i) {
		return this.lista.get(i);
	}
	
	public int size() {
		return lista.size();
	}
}