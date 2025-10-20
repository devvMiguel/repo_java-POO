import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] nome = new String [n];
		double[] notas1 = new double [n];
		double[] notas2 = new double [n];
		
		for (int i=0; i<n; i++) {
			nome[i] = sc.next();
			notas1[i] = sc.nextDouble();
			notas2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		for (int i=0; i<n; i++) {
			double media = (notas1[i] + notas2[i]) / 2.0;
			if (media >= 6.0) {
				System.out.println(nome[i]);
			}
		}

		sc.close();
	}

}
