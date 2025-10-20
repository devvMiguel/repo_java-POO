import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();		

		while (X != 0) {
			if (X % 2 != 0) {
				X += 1;
				
			}
			
			int soma = 5 * X + 20;
			System.out.println(soma);
			X = sc.nextInt();
		}
		
		sc.close();
	}
}