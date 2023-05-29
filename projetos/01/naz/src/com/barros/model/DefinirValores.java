package com.barros.model;

public class DefinirValores {
	public void defineEstilo() {
		if(Dados.getEstilo() == 1) {
			Dados.setEstiloString("Wushu");
		}else if(Dados.getEstilo() == 2) {
			Dados.setEstiloString("Sanda");
		}else if(Dados.getEstilo() == 3) {
			Dados.setEstiloString("Cassetete");
		}
	}
	
	public void defineTipoRotina() {
		if (Dados.getTipoRotina() == 1) {
			Dados.setTipoRotinaString("Mãos Livres");
		}else if(Dados.getTipoRotina() == 2) {
			Dados.setTipoRotinaString("Armas Longas");
		}else if (Dados.getTipoRotina() == 3) {
			Dados.setTipoRotinaString("Armas Medias");
		}else if(Dados.getTipoRotina() == 4) {
			Dados.setTipoRotinaString("Armas Curtas");
		}
	}
	
	public void defineNaipe() {
		if(Dados.getNaipe() == 1) {
			Dados.setNaipeString("Masculino");
		}else if(Dados.getNaipe() == 2) {
			Dados.setNaipeString("Feminino");
		}
	}
}
