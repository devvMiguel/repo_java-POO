import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int x = 0;
		int y = 0;
		for (int i=0; i < N;i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			double result =(double) x / y;
			
			if (y == 0) {
				System.out.println("divisao impossivel");		
			}
			else {
				System.out.printf("%.1f%n",result);
			}
		}		
		sc.close();
	}
}
