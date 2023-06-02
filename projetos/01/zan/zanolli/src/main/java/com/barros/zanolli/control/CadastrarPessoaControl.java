package com.barros.zanolli.control;

import java.util.Scanner;

import com.barros.zanolli.json.CriarJSON;
import com.barros.zanolli.model.Dados;
import com.barros.zanolli.model.DefinirValores;
import com.barros.zanolli.model.FaixaEtaria;
import com.barros.zanolli.view.CadastroView;

public class CadastrarPessoaControl {
	private Scanner s;

	public void cadastrarPessoa() {
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
		CriarJSON bd = new CriarJSON();
		bd.criarJSON();
	}
}
