package introducao;

import java.util.Scanner;

public class EntradaESaida {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2;
		int soma;
		
		System.out.println("Digite o primeiro numero: ");
		n1=ler.nextInt();
		System.out.println("Digite o primeiro numero: ");
		n2=ler.nextInt();
		
		System.out.println("numeros digitados: " + n1 + " e " + n2);
		
		soma = n1 + n2;
		
		System.out.println("A soma dos n�meros digitados �: " + soma);
		
	}

}
