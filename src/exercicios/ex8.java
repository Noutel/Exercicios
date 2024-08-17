package exercicios;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int hinicio;
		int hfim;
		
		
		
		
		hinicio = sc.nextInt();
		hfim = sc.nextInt();
		
		int duracao;
		
		if(hinicio < hfim ) {
			duracao = hfim - hinicio;
		} else {
			duracao = 24 - hinicio + hfim;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		
		
		sc.close();

	}

}
