package com.barros.zanolli.json;

import org.json.JSONArray;
import org.json.JSONObject;

import com.barros.zanolli.model.Dados;
import com.barros.zanolli.model.EscreveArquivos;

public class CriarJSON {
	public void criarJSON() {
		JSONObject pikachu = new JSONObject();
		JSONArray pikaLista = new JSONArray();
		JSONArray pikaArray = new JSONArray();
		EscreveArquivos escrever = new EscreveArquivos();
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
		escrever.escreverArquivo(pikaLista.put(pikachu).toString());
	}
}
