package br.com.dotum.test;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Integer x = s.nextInt();
		String a = s.next();
		String bc = s.nextLine();


		System.out.println(x);
		System.out.println(a);
		System.out.println(bc);


		s.close();

	}

}
