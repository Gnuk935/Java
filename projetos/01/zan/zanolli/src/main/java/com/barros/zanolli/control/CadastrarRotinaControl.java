package com.barros.zanolli.control;

import java.util.Scanner;

import com.barros.zanolli.json.RotinaJSON;
import com.barros.zanolli.model.Dados;
import com.barros.zanolli.model.DefinirValores;
import com.barros.zanolli.view.CadastroView;

public class CadastrarRotinaControl {
	private Scanner s;
	private int rep = 1;

	public void cadastrarRotina() {
		s = new Scanner(System.in);
		CadastroView view = new CadastroView();
		DefinirValores definir = new DefinirValores();
		CadastrarWushu cadWushu = new CadastrarWushu();
		do {
			view.estilo();
			Dados.setEstilo(s.nextInt());
			definir.defineEstilo();
			if (Dados.getEstilo() == 1) {
				cadWushu.cadastrarWushu();
			} else if (Dados.getEstilo() == 2) {
				view.peso();
				Dados.setPeso(s.nextFloat());
			}
			view.academia();
			Dados.setAcademia(s.nextInt());
			definir.defineAcademia();
			RotinaJSON rot = new RotinaJSON();
			rot.prenncherRotina();	
			view.repetir();
			rep = s.nextInt();
		} while (rep == 1);
	}
}
