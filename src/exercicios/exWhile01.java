package exercicios;

import java.util.Scanner;

public class exWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	sc = new Scanner(System.in);
		
		int senha;
		
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("senha invalida");
			
			senha = sc.nextInt();
			
		}
		
		System.out.println("Acesso Permitido");
		
		
		sc.close();
	}

}
