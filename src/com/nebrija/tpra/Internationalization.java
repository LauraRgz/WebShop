package com.nebrija.tpra;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.ResourceBundle;

public class Internationalization {
	private final ResourceBundle texto;
	private final Locale locale;
	
	public Internationalization (Locale locale) {
		this.locale = locale;
		//this.locale = Objects.requireNonNull(locale);
		texto = ResourceBundle.getBundle("MenuBoundle", locale);
	}
	
	public Locale getLocale() {
		return locale;
	}
	
	public String getMessages(String key, Object... arguments) {
		try {
			final String patron = texto.getString(key);
			final MessageFormat format = new MessageFormat(patron, getLocale());
			return format.format(arguments);
		}
		catch(MissingResourceException ex){
			return "!" + key;
		}
	}
	
}
	
	

