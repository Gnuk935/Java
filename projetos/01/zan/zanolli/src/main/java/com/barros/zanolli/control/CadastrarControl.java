package com.barros.zanolli.control;

import java.util.Scanner;

import com.barros.zanolli.model.Dados;
import com.barros.zanolli.model.DefinirValores;
import com.barros.zanolli.model.FaixaEtaria;
import com.barros.zanolli.view.CadastroView;

public class CadastrarControl {
	private Scanner s;
	private int rep = 1;

	public void cadastrar() {
		CadastroView view = new CadastroView();
		DefinirValores definir = new DefinirValores();
		FaixaEtaria faixa = new FaixaEtaria();
		CadastrarWushu cadWushu = new CadastrarWushu();
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
			if (Dados.getEstilo() == 1) {
				cadWushu.cadastrarWushu();
			}else if (Dados.getEstilo() == 2) {
				view.peso();
				Dados.setPeso(s.nextFloat());
			}
			view.academia();
			Dados.setAcademia(s.nextInt());
			definir.defineAcademia();
			view.repetir();
			rep = s.nextInt();
		} while (rep == 1);
		s.close();
	}
}
