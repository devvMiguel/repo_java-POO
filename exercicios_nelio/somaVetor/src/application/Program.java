package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for (int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		System.out.println();
		
		System.out.print("VALORES = ");
		for (int i=0; i<vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
		
		double soma = 0;
		for (int i=0; i<vet.length; i++) {
			soma += vet[i];
		}
		System.out.printf("%nSOMA = %.2f%n", soma);
		
		double media = soma / vet.length;
		System.out.printf("MEDIA = %.2f", media);
		
		sc.close();
	}

}
