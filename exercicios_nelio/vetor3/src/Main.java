import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] vet = new int [n];
		int[] vet2 = new int [n];
		
		for (int i=0; i<n; i++) {
			vet[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			vet2[i] = sc.nextInt();
		}
		
		int[] vet3 = new int [n];
		
		for (int i=0; i<n; i++) {
			vet3[i] = vet[i] + vet2[i];
		}
		
		for (int vetor : vet3) {
			System.out.print(vetor + " ");
		}

		sc.close();
	}

}
