package com.barros.zanolli.main;

import com.barros.zanolli.control.CadastrarPessoaControl;
import com.barros.zanolli.control.CadastrarRotinaControl;

public class Main {
	public static void main(String args[]) {
		CadastrarPessoaControl cad = new CadastrarPessoaControl();
		cad.cadastrarPessoa();
		CadastrarRotinaControl rot = new CadastrarRotinaControl();
		rot.cadastrarRotina();
	}
}
