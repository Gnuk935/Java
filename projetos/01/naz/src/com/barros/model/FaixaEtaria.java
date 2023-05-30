package com.barros.model;

public class FaixaEtaria {
	private static int idaNum;
	public void calcFaixaEtaria() {
		if (Dados.getIdade() < 9) {
			System.out.println("MIRIM");
			Dados.setFaixaEtaria(null);
			idaNum = 1;
		} else if (8 < Dados.getIdade() && Dados.getIdade() < 12) {
			System.out.println("INFANTIL");
			idaNum = 2;
		} else if (11 < Dados.getIdade() && Dados.getIdade() < 15) {
			System.out.println("INFANTO JUVENIL");
			idaNum = 3;
		} else if (14 < Dados.getIdade() && Dados.getIdade() < 18) {
			System.out.println("JUVENIL");
			idaNum = 4;
		} else if (Dados.getIdade() >= 18) {
			System.out.println("ADULTO");
			idaNum = 5;
		} else {
			System.out.println("erro");
		}
	}
	public static int getIdaNum() {
		return idaNum;
	}
	public static void setIdaNum(int idaNum) {
		FaixaEtaria.idaNum = idaNum;
	}
}