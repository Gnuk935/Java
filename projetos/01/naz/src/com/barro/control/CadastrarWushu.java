package com.barro.control;

import java.util.Scanner;

import com.barros.model.Dados;
import com.barros.model.DefinirValores;
import com.barros.view.CadastroView;

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
