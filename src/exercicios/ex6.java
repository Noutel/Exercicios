package exercicios;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x=sc.nextInt();
		
		if(x<0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NAO NEGATIVO");
		}
			
		sc.close();

	}

}
