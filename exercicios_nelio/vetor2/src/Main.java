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
		
		for (int par : vet) {
			if (par % 2 == 0) {
				System.out.print(par + " ");
			}
		}
		
		int pares = 0;
		
		for (int par : vet) {
			if (par % 2 == 0) {
				pares++;
			}
		}
		System.out.println();
		System.out.println(pares);
		
		sc.close();
	}

}
