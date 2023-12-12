package com.json;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONObject;

public class RecebendoEscrevendo {
	public static void main(String[] args) {
		Scanner s;
		JSONObject pikachu = new JSONObject();
		FileWriter escreve = null;
		String nome;
		int i = 1;

		s = new Scanner(System.in);
		do {
			System.out.println("Informe seu nome:");
			nome = s.next();

			pikachu.put("Nome", nome);
			pikachu.put("Idade", 10);
			pikachu.put("Valor", "Valor");

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
			System.out.println("Deseja cadastrar mais alguém?");
			System.out.println("1 - SIM");
			System.out.println("2 - NÃO");
			i = s.nextInt();
			System.out.println("===============================");
		} while (i == 1);
		s.close();
	}

}
