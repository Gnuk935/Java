package listas;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nome = null;

		String[] array = new String[10];

		System.out.println("Digite o seu nome");
		nome = sc.next();
		
		sc.close();
		
		array[0] = "Victor";
		array[1] = "Carlos";
		array[2] = "Ana Clara";
		array[3] = "João Cleber";
		array[4] = "Joana";
		array[5] = "Jhenifer";
		array[6] = "Luzia";
		array[7] = "Mauro";
		array[8] = "Jefesson";
		array[9] = nome;

		for(int posicao = 0	; posicao < 10; posicao++) {

			System.out.println(array[posicao]);
		}

	}
}
