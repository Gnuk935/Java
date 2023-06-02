package com.barros.zanolli.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreveArquivos {
	public void escreverArquivo(String escrever) {
	try (BufferedWriter con = new BufferedWriter(new FileWriter("dado.json",true))){		
		con.write(escrever);
		con.newLine();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
