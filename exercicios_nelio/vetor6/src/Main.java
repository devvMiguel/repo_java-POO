import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] nome = new String [n];
		int[] idade = new int [n];
		
		for (int i=0; i<n; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
		}
		
		double maior = idade[0];
		int posicaoMaior = 0;
		
		for (int i=1; i<n; i++) {
			if (idade[i] > maior) {
				maior = idade[i];
				posicaoMaior = i;
			}
		}
			
		
		System.out.printf("Pessoa mais velha: %s", nome[posicaoMaior]);

		sc.close();
	}

}
