package listas;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome = null;
		
		/*Integer idade = 0;
		Integer altura = 0;
		String voce = null;
		
		System.out.println("Olá! Por favor me fale mais sobre você");*/
		
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("Diga algo que você gostaria de falar mil vezes!");
		nome = sc.next();
		
		//System.out.println("Qual é a sua idade?");
		
		sc.close();
		
		list.add(nome);
		
		for(int posicao = 0	; posicao < 1000; posicao++) {

			System.out.println(list);
		}
		
		System.out.println("Cade a sua sanidade mental?");
	}
}
