package com.barros.zanolli.control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import com.barros.zanolli.model.Dados;

public class CriarJSON {
	public void criarJSON() {
		try {
			FileReader arquivoJSON = new FileReader("dado.json");
			BufferedReader ler = new BufferedReader(arquivoJSON);
			System.out.println(ler);
			JSONObject pokemon = new JSONObject();
			JSONArray pokemonLendario =  pokemon.getJSONArray("dados");
			JSONObject pikachu = new JSONObject(pokemonLendario);
			JSONArray pikaLista = new JSONArray();
			JSONArray pikaArray = new JSONArray();
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
			
			pikaArray.put("maosLivres");
			pikaArray.put("armasMedias");
			pikaArray.put("ArmasLongas");
			pikachu.put("rotinaList", pikaArray);
			pikaLista.put(pikachu);
			
			try {
				escreve = new FileWriter("dado.json", true);
				BufferedWriter con = new BufferedWriter(escreve);
				
				con.write(pikaLista.toString());
				con.newLine();
				con.close();
				if (Dados.getEstilo() == 1) {
					RotinasJSON rot = new RotinasJSON();
					rot.prenncherRotina();				
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
