package exercicios;

import java.util.Scanner;

public class ex2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double pi = 3.14159;
		double area;
		
		raio = sc.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.printf("Area=%.4f", area);
		
		
		
		sc.close();
		
	}

}
