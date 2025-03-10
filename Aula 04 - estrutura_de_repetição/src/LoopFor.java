package estrutura_de_repeticao;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + "*" + i + "=" + numero*i);
		}
		
		sc.close();
		

	}

}
