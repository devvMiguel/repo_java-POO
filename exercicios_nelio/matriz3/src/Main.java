import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int [][] mat = new int [N][N];
		
		//Preencher a matriz
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				mat [i][j] = sc.nextInt();
			}
		}
		// Imprime o maior elemento de cada linha
		for (int i=0; i<N; i++) {
			int maior = 0;
			for (int j=0; j<N; j++) {
				if (mat [i][j] > maior) {
					maior = mat [i][j];
				}
			}
			System.out.println(maior);
		}
		
		sc.close();
	}

}
