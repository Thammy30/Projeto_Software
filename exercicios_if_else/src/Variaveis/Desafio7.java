package Variaveis;

import java.util.Scanner;

public class Desafio7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o lado A: ");
		double a = scanner.nextDouble();
		
		System.out.print("Digite o lado B: ");
		double b = scanner.nextDouble();
		
		System.out.print("Digite o lado C: ");
		double c = scanner.nextDouble();
		
		if (a == b && b == c) {
            System.out.println("O triângulo é Equilátero.");
        } else if (a == b || b == c || a == c) {
            System.out.println("O triângulo é Isósceles.");
        } else {
        	System.out.println("O triângulo é Escaleno");
        }
		
		scanner.close();
		
	}

}
