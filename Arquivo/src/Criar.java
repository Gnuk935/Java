import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Criar {
	public static void main(String[] args) {
		int x =0;

		//Criação do arquivo:  
		try {
			//Nome do arquivo
			File arquivo = new File("C:\\Users\\Victor Barros\\Documents\\Teste\\arquivo.pdf");

			//Cria o arquivo 
			if (arquivo.createNewFile()) {
				System.out.println("Arquivo Criado: " + arquivo.getName());   
			} else {
				System.out.println("Arquivo já existe");
			}
		} catch (IOException e) {
			System.out.println("Um erro ocorreu!");
			e.printStackTrace();
		}

		//Escrevendo no arquivo
		try {
			FileWriter escrever = new FileWriter("C:\\Users\\Victor Barros\\Documents\\Teste\\arquivo.pdf");
			escrever.write("Deu certo?");
			escrever.close();
			System.out.println("Escreveu!");
		} catch (IOException e) {
			System.out.println("Ocorreu um erro");
			e.printStackTrace();
		}

		//Lendo o arquivo
		try {
			File ler = new File("C:\\Users\\Victor Barros\\Documents\\Teste\\arquivo.pdf");
			Scanner leitura = new Scanner(ler); //puxa o escaner 
			while (leitura.hasNextLine()) {
				String escrito = leitura.nextLine();
				System.out.println(escrito);
			}
			leitura.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro");
			e.printStackTrace();
		}

		File ler = new File("C:\\Users\\Victor Barros\\Documents\\Teste\\arquivo.pdf");
		if (ler.exists()) {
			System.out.println("Nome do arquivo:" + ler.getName());
			System.out.println("Caminho" + ler.getAbsolutePath());
			System.out.println("Posso escrever?: " + ler.canWrite());
			System.out.println("Posso ler?: " + ler.canRead());
			System.out.println("Tamano dessa josa em byte: " + ler.length());
		} else {
			System.out.println("Num sei onde tá");
		}

		File exluir = new File("C:\\Users\\Victor Barros\\Documents\\Teste\\arquivo.pdf"); 
		for(x = 0; x <= 1000000; x++){
			System.out.println("Deletando em:" + x);
		}{
			if(exluir.delete()){ 
				System.out.println("O arquivo foi deletado: " + exluir.getName());
			}
		}

	}}

