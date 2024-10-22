package aprendendojava;

import java.util.Scanner;

public class execParametro {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
		
		
		String nome;
		double n1, n2, n3, n4, media;
	
		System.out.println("Qual seu nome? ");
		 nome = scanner.next();
		 System.out.println("informe a primeira nota: ");
		 n1 = scanner.nextDouble();
		
		 System.out.println("me informe a segunda nota: ");
		 n2 = scanner.nextDouble();
		
		 System.out.println("me informe a terceira nota: ");
		 n3 = scanner.nextDouble();
		
		 System.out.println("me informe agora a quarta nota: ");
		 n4 = scanner.nextDouble();
		
		 media = (n1 + n2 + n3 + n4)/4;
		
		 mostraSituacao(nome, media);
		 }
		
		
	
		
	public static void mostraSituacao(String nome, double media) {
		
		if(media >=7){
			System.out.println("Parabens " + nome + " Voce foi aprovado! Sua media foi: " + media);
		} else if (media<4){
			System.out.println("Que pena... Voce foi reprovado. Sua media foi: " + media);
		} else {
			System.out.println("Olá, " + nome + "! Você terá que fazer a prova final");
		}
		
		
			
	}
	
	
}
