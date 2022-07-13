package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Para este exemplo foi ultilizado como base
 * o toturial do canal DevDojo
 * Link do video: --
 */
public class ExpressaoRegular {
	public static void main(String[] args) {
		String regex = "^[a-zA-Z]{3}[0-9][0-9A-Za-z][0-9][5]$";
		String texto = "ASD1B35";

		Pattern exp = Pattern.compile(regex); // Compila o regex
		Matcher txt = exp.matcher(texto); // Onde se aplica o regex

		System.out.println("Texto: " + texto);
		System.out.println("Indice: 123456");
		System.out.println("Expressão: " + txt.pattern());
		System.out.println("posições econtradas");
		while (txt.find()) {
			System.out.println(txt.start() + " ");

		}

	}

}
