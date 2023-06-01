package com.barros.teste;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONObject;
public class Escrever {
	public static void main(String[] args) {

		JSONObject pikachu = new JSONObject();
		FileWriter escreve = null;
		String[] nome = new String[3];

		try (Scanner s = new Scanner(System.in)) {

			for (int i = 0; i < nome.length; i++) {

				System.out.println("Informe seu nome:");
				nome[i] = s.next();

				pikachu.put("Nome", nome[i]);
				pikachu.put("Idade", 10);
				pikachu.put("Valor", "Valor");

			}

			try {
				escreve = new FileWriter("dado.json", true);
				BufferedWriter con = new BufferedWriter(escreve);
				

				con.write(pikachu.toString());
				con.newLine();
				con.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println(pikachu);
			s.close();
		}

	}
}
