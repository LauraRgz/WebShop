package com.nebrija.tpra;

public class User {
	private String email;
	private String password;
	private String login;
	private double id;	
	
	public double getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	User (String email, String password, String login){
		this.email= email;
		this.password = password;
		this.login = login;
		this.id = Math.random() * 100;
	}
	User (int id){
		this.id = id;
	}
	
	public User() {

	}
	void newUser (String email, String password, String login) {
		User userAux = new User(email, password, login);
	
	}
	
	void showUser(User userAux) {
		System.out.println("Email: " + userAux.email);
		System.out.println("Username: " + userAux.login);
		System.out.println("ID: " + userAux.id);
		
	}
}