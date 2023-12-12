package moedas.calculo;

import java.util.Scanner;

import moedas.qual.Valores;
import moedas.view.Tela;

public class Calcular {
	private static int x;

// Clase para cacular as moedas
	public static void main(String[] args) {
		Tela view = new Tela(); // A tela
		/*
		 * Definindo os valores de cada moeda
		 */

		Valores v = new Valores();
		Valores cinco = new Valores();
		Valores dez = new Valores();
		Valores vinte = new Valores();
		Valores cinque = new Valores();
		Valores um = new Valores();

		try (Scanner s = new Scanner(System.in)) {
			view.inicio(); // Link start
			view.espaco();

			/*
			 * Começa a brincadeira
			 */

			// Definindo 5
			view.defineCincoR(); // numero de colunas
			cinco.setN(s.nextInt());
			view.branco();

			view.defineCincoN(); // numero de linhas
			cinco.setR(s.nextInt());
			view.branco();
			// Confirmação sobre A
			view.sobreA();
			x = s.nextInt();
			if (x == 1) {
				view.defineCincoA();
				cinco.setA(s.nextInt());
			} else if (x == 2) {

			}

			view.espaco();

			// Defindo dez
			view.defineDezR(); // numero de colunas
			dez.setN(s.nextInt());
			view.branco();

			view.defineDezN(); // numero de linhas
			dez.setR(s.nextInt());
			view.branco();
			// Confirmação sobre A
			view.sobreA();
			x = s.nextInt();
			if (x == 1) {
				view.defineDezA();
				dez.setA(s.nextInt());
			} else if (x == 2) {

			}

			view.espaco();

			// Defindo vinte e cinco
			view.defineVinteR(); // numero de colunas
			vinte.setN(s.nextInt());
			view.branco();
			view.defineVinteN(); // numero de linhas
			vinte.setR(s.nextInt());
			view.branco();
			// Confirmação sobre A
			view.sobreA();
			x = s.nextInt();
			if (x == 1) {
				view.defineVinteA();
				vinte.setA(s.nextInt());
			} else if (x == 2) {

			}

			view.espaco();

			// Cinquenta centavos
			view.defineCinquentaR(); // numero de colunas
			cinque.setN(s.nextInt());
			view.branco();
			view.defineCinquentaN(); // numero de linhas
			cinque.setR(s.nextInt());
			view.branco();
			// Confirmação sobre A
			view.sobreA();
			x = s.nextInt();
			if (x == 1) {
				view.defineCinquentaA();
				cinque.setA(s.nextInt());
			} else if (x == 2) {

			}

			view.espaco();

			// Define um real
			view.defineUmR(); // numero de colunas
			um.setN(s.nextInt());
			view.branco();
			view.defineUmN(); // numero de linhas
			um.setR(s.nextInt());
			view.branco();
			// Confirmação sobre A
			view.sobreA();
			x = s.nextInt();
			if (x == 1) {
				view.defineUmA();
				um.setA(s.nextInt());
			} else if (x == 2) {

			}
		}

		view.espaco(); // Apenas um espaço kk

		v.setnRc((cinco.getR() * cinco.getN() - cinco.getA()) * 0.5); // Cinco centavos
		v.setnRd((dez.getR() * dez.getN() - dez.getA()) * 0.10); // Dez centavos
		v.setnRv((vinte.getR() * vinte.getN() - vinte.getA()) * 0.25); // Vinte e cinco centavos
		v.setnRcc((cinque.getR() * cinque.getN() - cinque.getA()) * 0.50); // Cinquenta centavos
		v.setnRu((um.getR() * um.getN() - um.getA()) * 1); // Um real

		// Calculo final

		v.setresultado(v.getnRc() + v.getnRd() + v.getnRv() + v.getnRcc() + v.getnRu());

		view.esp();
		System.out.println("O resultado é: R$" + v.getresultado());

	}

	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		Calcular.x = x;
	}
}
