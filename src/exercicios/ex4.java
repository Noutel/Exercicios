package exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		int hTrabalhadas;
		double vHoraTrabalhada;
		double salario;
		
		number = sc.nextInt();
		hTrabalhadas = sc.nextInt();
		vHoraTrabalhada = sc.nextDouble();
		salario = hTrabalhadas * vHoraTrabalhada;
		
		System.out.println("NUMBER =" + number);
		System.out.printf("SALARY U$ %.2f",salario);
		
		
		sc.close();

	}

}
