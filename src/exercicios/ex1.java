package exercicios;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		int soma;
		
		A = sc.nextInt();
		B = sc.nextInt();
		soma = A + B;
		System.out.println("A soma dos valores são:" + soma);
		
		sc.close();

	}

}
