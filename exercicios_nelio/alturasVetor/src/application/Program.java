package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double averageHeight, percentualAge;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();
		
		String[] name = new String[N];
		int[] age = new int[N];
		double[] height = new double[N];
		
		for (int i=0; i<N; i++) {
			System.out.printf("Dados da %da pessoa:%n", i + 1);
			System.out.print("Nome: ");
			name[i] = sc.next();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			System.out.print("Altura: ");
			height[i] = sc.nextDouble();
		}
		
		double somaAltura =0;
		for (int i=0; i<N; i++) {
			somaAltura += height[i];
		}
		averageHeight = somaAltura / height.length;
		
		double countIdade = 0;
		for (int i=0; i<N; i++) {
			if (age[i] < 16) {
				countIdade++;
			}
		}
		percentualAge = countIdade / N * 100;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", averageHeight);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentualAge);
		
		for (int i=0; i<N; i++) {
			if (age[i] < 16) {
				System.out.println(name[i]);
			}
		}
				
		sc.close();
	}

}
