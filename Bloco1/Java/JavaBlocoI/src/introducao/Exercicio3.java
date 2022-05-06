package introducao;
/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int idade;

		System.out.println("Digite a idade:  ");
		idade = ler.nextInt();

		if (idade < 10) {
			System.out.println("Crianca menor de 10 anos");

		} else if (idade >= 10 && idade <= 14) {
			System.out.println("Infantil");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Juvenil");
		} else {
			System.out.println("Adulto");
		}
	}

}
