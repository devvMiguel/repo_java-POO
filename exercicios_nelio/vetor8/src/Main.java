import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] altura = new double [n];
		char[] sexo = new char [n];
		
		for (int i=0; i<n; i++) {
			altura[i] = sc.nextDouble();
			sexo[i] = sc.next().charAt(0);
		}
		
		double menor = altura[0];
		
		for (int i=1; i<n; i++) {
			if (altura[i] < menor) {
				menor = altura[i];
			}
		}
		System.out.printf("Menor altura = %.2f%n", menor);
		
		double maior = altura[0];
		
		for (int i=1; i<n; i++) {
			if (altura[i] > maior) {
				maior = altura[i];
			}
		}
		System.out.printf("Maior altura = %.2f%n", maior);
		
		int countMulheres = 0;
		double somaAltura = 0;
		
		for (int i=0; i<n; i++) {
			if (sexo[i] == ('F')) {
				somaAltura += altura[i];
				countMulheres++;
			}
		}
		double mediaAlturaMulheres = somaAltura / countMulheres;
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
		
		int countHomens = 0;
		for (int i=0; i<n; i++) {
			if (sexo[i] == ('M')) {
				countHomens++;
			}
		}
		System.out.printf("Numero de homens = %d", countHomens);
		
		sc.close();
	}

}
