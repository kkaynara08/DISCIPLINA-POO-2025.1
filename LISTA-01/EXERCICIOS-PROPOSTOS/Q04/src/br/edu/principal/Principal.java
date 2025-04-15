package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Digite a primeira nota(peso 2): ");
		Double nota1 = Scanner.nextDouble();
		System.out.println("Digite a segunda nota(peso 3): ");
		Double nota2 = Scanner.nextDouble();
		
	    double mediaPonderada = (nota1 * 2 + nota2 * 3) / (2 + 3);
	    
	    System.out.print("A média ponderada é: " + mediaPonderada);
		
		

	}

}