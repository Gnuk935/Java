package com.barros.main;
import com.barro.control.CadastrarControl;
import com.barros.model.Dados;
public class Main {
	public static void main(String args[]) {
		CadastrarControl cad = new CadastrarControl();
		cad.cadastrar();
		System.out.println(Dados.getIdade());
	}
}
