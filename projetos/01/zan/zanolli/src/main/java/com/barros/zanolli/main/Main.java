package com.barros.zanolli.main;
import com.barros.zanolli.control.CadastrarControl;
import com.barros.zanolli.control.CriarJSON;
public class Main {
	public static void main(String args[]) {
		CadastrarControl cad = new CadastrarControl();
		CriarJSON bd = new CriarJSON();
		cad.cadastrar();
		bd.criarJSON();
		
	}
}
