package com.nebrija.tpra;

public class HiloEscrituraCola extends LectoraLineaComandos implements Runnable{

	User usuario;
	HiloLecturaCola hilo;
	
	public HiloEscrituraCola(User usuario, HiloLecturaCola hilo) {
		this.usuario = usuario;
		this.hilo = hilo;
		
	}
	@Override
	public void run() {
		System.out.println("The user is being registered ");
		usuario.setEmail(this.leerLinea());
		hilo.interrupt();
	}

}
