import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] vet = new int [n];
		
		for (int i=0; i<n; i++) {
			vet[i] = sc.nextInt();
		}
		
		int soma = 0;
		double qtdPares = 0.0;
		
		for (int par : vet) {
			if (par % 2 == 0) {
				soma += par;
				qtdPares++;
			}
		}
		System.out.printf("%.1f",soma / qtdPares);
		sc.close();
	}

}
