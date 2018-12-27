package com.nebrija.tpra;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class LectoraLineaComandos {
	public String leerLinea() {
		
		String email;
		
		LineNumberReader lnr1 = new LineNumberReader(new InputStreamReader(System.in));
		
		try{
			email =lnr1.readLine();
		}
		catch(IOException e) {
			e.printStackTrace();
			email = "";;
		}
		return email;
	}
	
	
}

