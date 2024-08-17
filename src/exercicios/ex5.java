package exercicios;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, nPecas1,cod2,nPecas2;
		double vPecas1,vpecas2;
		double vTotalPeca1, vTotalPeca2, vTotal;
		
		cod1 = sc.nextInt();
		nPecas1 = sc.nextInt();
		vPecas1= sc.nextDouble();
		cod2 = sc.nextInt();
		nPecas2 = sc.nextInt();
		vpecas2 = sc.nextDouble();
		
		vTotalPeca1 = nPecas1 * vPecas1;
		vTotalPeca2 = nPecas2 * vpecas2;
		vTotal = vTotalPeca1 + vTotalPeca2;
		
		System.out.printf("VALOR A PAGAR: R$%.2f", vTotal);
		
		
		
		sc.close();
		
	}

}
