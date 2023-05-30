package com.barros.model;

import java.util.Calendar;
import java.util.Date;

public class DefinirValores {
	private int ano;
	private int mes;
	public void defineEstilo() {
		if (Dados.getEstilo() == 1) {
			Dados.setEstiloString("Wushu");
		} else if (Dados.getEstilo() == 2) {
			Dados.setEstiloString("Sanda");
		} else if (Dados.getEstilo() == 3) {
			Dados.setEstiloString("Cassetete");
		}
	}

	public void defineTipoRotina() {
		if (Dados.getTipoRotina() == 1) {
			Dados.setTipoRotinaString("Mãos Livres");
		} else if (Dados.getTipoRotina() == 2) {
			Dados.setTipoRotinaString("Armas Longas");
		} else if (Dados.getTipoRotina() == 3) {
			Dados.setTipoRotinaString("Armas Medias");
		} else if (Dados.getTipoRotina() == 4) {
			Dados.setTipoRotinaString("Armas Curtas");
		}
	}

	public void defineNaipe() {
		if (Dados.getNaipe() == 1) {
			Dados.setNaipeString("Masculino");
		} else if (Dados.getNaipe() == 2) {
			Dados.setNaipeString("Feminino");
		}
	}

	public void defineIdade() {
		Date data = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		ano = cal.get(Calendar.YEAR);
		mes = cal.get(Calendar.MONTH) + 1;
		int idadeFin = (ano - 1) - Dados.getAnoNascimento();
		if (Dados.getMesNascimento() < mes) {
			idadeFin = idadeFin + 1;
		}
		Dados.setIdade(idadeFin);
	}
	
	public void defineNivel() {
		if (Dados.getNivel() == 1) {
			Dados.setNivelString("A");
		}else if (Dados.getNivel() == 2) {
			Dados.setNivelString("B");
		}
	}
	
	public void defineAcademia() {
		
	}
}
