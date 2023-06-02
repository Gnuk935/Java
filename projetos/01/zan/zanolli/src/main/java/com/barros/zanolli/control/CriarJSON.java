package com.barros.zanolli.control;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;

import com.barros.zanolli.model.Dados;

public class CriarJSON {
	public void criarJSON() {
		//JSONArray pikaLista = new JSONArray();
		JSONObject pikachu = new JSONObject();
		FileWriter escreve = null;

		pikachu.put("nome", Dados.getAtleta());
		pikachu.put("estilo", Dados.getEstiloString());
		pikachu.put("estiloID", Dados.getEstilo());
		pikachu.put("naipe", Dados.getNaipeString());
		pikachu.put("naipeID", Dados.getNaipe());
		pikachu.put("diaNascimento", Dados.getDiaNascimeto());
		pikachu.put("mesNascimento", Dados.getMesNascimento());
		pikachu.put("anoNascimento", Dados.getAnoNascimento());
		pikachu.put("idade", Dados.getIdade());
		pikachu.put("faixaEtaria", Dados.getFaixaEtaria());
		pikachu.put("nivel", Dados.getNivelString());
		pikachu.put("nivelID", Dados.getNivel());
		pikachu.put("academia", Dados.getAcademiaString());
		pikachu.put("academiaID", Dados.getAcademia());
		
		

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

	}
}
