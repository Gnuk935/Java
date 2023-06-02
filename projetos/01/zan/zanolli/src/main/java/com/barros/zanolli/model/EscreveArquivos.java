package com.barros.zanolli.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.barros.zanolli.json.CriarJSON;

public class EscreveArquivos {
	public void escreverArquivo() {
	try (BufferedWriter con = new BufferedWriter(new FileWriter("dado.json",true))){		
		con.write(CriarJSON.getLista().toString());
		con.newLine();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
