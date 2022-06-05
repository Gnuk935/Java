package br.com.controler;

import br.com.enumjava.EnumOperacao;

public class Calccontroler {
	//Armazena o valor total
	private Double total;
	
	//Realiza a operação
	public Double realizerOperacao(EnumOperacao operacao, Double valor){
		if (operacao.equals(EnumOperacao.SOMA)) {
			total +=valor;
		}else if (operacao.equals(EnumOperacao.SUBTRACAO)) {
			total -=valor;
		}else if (operacao.equals(EnumOperacao.DIVISAO)) {
			total /= valor;
		}else if (operacao.equals(EnumOperacao.MULTIPLICACAO)) {
			total *= valor;
		}
		return total;
	}
	
	public Double getTotal() {
		return this.total;
	}
	
	public void zerar() {
		total = 0.0;
	}
}
