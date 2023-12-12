package com.barros.zanolli.control;

import java.util.Scanner;

import com.barros.zanolli.model.Dados;
import com.barros.zanolli.model.DefinirValores;
import com.barros.zanolli.view.CadastroView;

public class CadastrarWushu {
	private Scanner s;
	
	public void cadastrarWushu() {
		CadastroView view = new CadastroView();
		DefinirValores definir = new DefinirValores();
		s = new Scanner(System.in);
		view.rotina();
		Dados.setRotina(s.next());
		view.tipoRotina();
		Dados.setTipoRotina(s.nextInt());
		definir.defineTipoRotina();
		view.nivel();
		Dados.setNivel(s.nextInt());
		definir.defineNivel();
	}
}
