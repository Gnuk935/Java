package com.barro.control;

import java.util.Scanner;

import com.barros.model.Dados;
import com.barros.model.DefinirValores;
import com.barros.model.FaixaEtaria;
import com.barros.view.CadastroView;

public class CadastrarControl {
	private Scanner s;
	private int rep = 1;

	public void cadastrar() {
		CadastroView view = new CadastroView();
		DefinirValores definir = new DefinirValores();
		FaixaEtaria faixa = new FaixaEtaria();
		s = new Scanner(System.in);
		view.introducao();
		view.nome();
		Dados.setAtleta(s.next());
		view.naipe();
		Dados.setNaipe(s.nextInt());
		definir.defineNaipe();
		view.diaNascimento();
		Dados.setDiaNascimeto(s.nextInt());
		view.mesNascimento();
		Dados.setMesNascimento(s.nextInt());
		view.anoNascimento();
		Dados.setAnoNascimento(s.nextInt());
		definir.defineIdade();
		faixa.calcFaixaEtaria(); // avaliar se deve ficar aqui
		do {			
			view.estilo();
			Dados.setEstilo(s.nextInt());
			definir.defineEstilo();
			view.rotina();
			Dados.setRotina(s.next());
			view.tipoRotina();
			Dados.setTipoRotina(s.nextInt());
			definir.defineTipoRotina();
			view.nivel();
			Dados.setNivel(s.nextInt());
			definir.defineNivel();
			if (Dados.getEstilo() == 2) {
				view.peso();
				Dados.setPeso(s.nextFloat());
			}
			view.academia();
			Dados.setAcademia(s.nextInt());
			definir.defineAcademia();
			view.repetir();
			rep = s.nextInt();
		} while (rep == 1);
	}
}
