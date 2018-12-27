package com.nebrija.tpra;

public class HiloLecturaCola extends Thread {
	User usuario;
	public HiloLecturaCola(User usuario) {
		this.usuario = usuario;
	}
	
	public void run() {
		try {
			sleep(1000);
		}
		catch (InterruptedException e) {
			System.out.println("The user is being registered");
		}
		String valor = usuario.getEmail();
		System.out.println("The user " + " has been correctly registered");
	}
	
}
