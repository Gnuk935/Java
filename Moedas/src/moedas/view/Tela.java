package moedas.view;

public class Tela {
	public void inicio() {
		System.out.println("========================================================================");
		System.out.println("Olá! Este é um sistema basico de contagem de moedas");
		System.out.println("Para fazer a contagem defina os valores de:");
		System.out.println("n = linha");
		System.out.println("r = coluna");
		System.out.println("a = este valor é para o caso de não ter uma coluna ou linha incompleta");
		System.out.println("Cada esses valores são setados a cada valor de moeda!");
		System.out.println("========================================================================");
		System.out.println("Por exemplo: 63 moedas de 10 centavos");
		System.out.println(
				"Então eu as organizo em 8 colunas por 8 linhas, menos 1 linha pois falta uma moeda para fechar a coluna");
		System.out.println("Ou seja n = 8 r = 8 a = 1");
	}

	public void defineCincoN() {

		System.out.println("Informe o valor de n para Cinco centavos (numero de colunas)");
	}

	public void defineCincoR() {
		System.out.println("===CINCO CENTAVOS===");
		System.out.println("Informe o valor de r para Cinco centavos (numero de linhas)");
	}

	public void defineCincoA() {
		System.out.println("Informe o valor de a para Cinco centavos (deixe 0 caso não tenha");
	}

	public void defineDezN() {
		System.out.println("Informe o valor de n para Dez centavos (numero de colunas)");
	}

	public void defineDezR() {
		System.out.println("===DEZ CENTAVOS===");
		System.out.println("Informe o valor de r para Dez centavos (numero de linhas)");
	}

	public void defineDezA() {
		System.out.println("Informe o valor de a para Dez centavos (deixe 0 caso não tenha");
	}

	public void defineVinteN() {
		System.out.println("Informe o valor de n para Vinte e cinco centavos (numero de colunas)");
	}

	public void defineVinteR() {
		System.out.println("===VINTE E CINCO CENTAVOS===");
		System.out.println("Informe o valor de r para Vinte e cinco centavos (numero de linhas)");
	}

	public void defineVinteA() {
		System.out.println("Informe o valor de a para Vinte e cinco centavos (deixe 0 caso não tenha");
	}

	public void defineCinquentaN() {
		System.out.println("Informe o valor de n para Cinquenta centavos (numero de colunas)");
	}

	public void defineCinquentaR() {
		System.out.println("===CINQUENTA CENTAVOS===");
		System.out.println("Informe o valor de r para Cinquenta centavos (numero de linhas)");
	}

	public void defineCinquentaA() {
		System.out.println("Informe o valor de a para Cinquenta centavos (deixe 0 caso não tenha");
	}

	public void defineUmN() {
		System.out.println("Informe o valor de n para Um real (numero de colunas)");
	}

	public void defineUmR() {
		System.out.println("===UM REAL===");
		System.out.println("Informe o valor de r para Um real (numero de linhas)");
	}

	public void defineUmA() {
		System.out.println("Informe o valor de a para Um real (deixe 0 caso não tenha");
	}

	public void sobreA() {
		System.out.println("Você deseja atribuir um valor para A?");
		System.out.println("Digite 1 para SIM");
		System.out.println("Digite 2 para NÃO");
	}

	public void espaco() {
		System.out.println(" ");
		System.out.println("========================================================================");
		System.out.println(" ");
	}

	public void branco() {
		System.out.println(" ");
	}

	public void esp() {
		System.out.println("Estamos calculando, aguarde...");
	}

}
