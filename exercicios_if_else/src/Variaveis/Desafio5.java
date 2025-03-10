package Variaveis;

import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor total da compra: R$ ");
        double compra = scanner.nextDouble();
        
        System.out.print("Digite o número de itens adquiridos: ");
        int itens = scanner.nextInt();
        
        double Desconto = 0;

        if(compra > 1000) {
        	Desconto = 20;
        } else if(compra > 500 || itens > 5) {
        	Desconto = 10; 
        } else if(compra > 300 || itens > 3) {
        	Desconto = 5; 
        }
        double valorDesconto = compra * (1 - Desconto / 100);
        
        if (valorDesconto > 0) {
        	System.out.println("Desconto de " + valorDesconto + " % aplicado! ");
        } else {
        	System.out.printf("Nenhum desconto aplicado.");
        }

       System.out.printf("Valor final: R$ %.2f\n", valorDesconto);

      
        scanner.close();
    }

	}


