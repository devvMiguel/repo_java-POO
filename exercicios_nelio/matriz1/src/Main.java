import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] mat = new int [M][N];
		
		
		// Preencher a matriz
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		// Imprimir valores negativos
		System.out.println("VALORES NEGATIVOS:");
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				if (mat[i][j] < 0) {
					System.out.println(mat[i][j]);
				}
			}
		}
		
		sc.close();
	}

}
