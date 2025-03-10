package estrutura_de_repeticao;

import java.util.Scanner;

public class loopWhileBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String loginSalvo = "admin";
		String senhaSalva = "1234";
		String login = "";
		String senha = "";
		int tentativas = 1;
		int maxTentativas = 5;
		
		while (true) {
			
			System.out.print("Informe seu login: ");
			login = sc.nextLine();
		    
			System.out.print("Informe sua senha: ");
			senha = sc.nextLine();
			
			if(login.equals(loginSalvo) && senha.equals(senhaSalva)) {
				System.out.println("Acesso Liberado!");
				break;
				
			} 
			else if(tentativas >= maxTentativas) {
				System.out.println("Número maximo de tentativas excedido, acesso bloqueado!");
				break;
			}
			else {
				tentativas ++;
				System.out.println("Acesso negado, tente novamente!");
				
			}
		}

		 sc.close();
	}

}
