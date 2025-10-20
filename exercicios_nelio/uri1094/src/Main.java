import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int N = sc.nextInt();
		
		int c = 0;
		int r = 0;
		int s = 0;
		
		for (int i=0; i < N;i++) {
			
			int quantia = sc.nextInt();
			char tipo = sc.next().charAt(0);
			
			if(tipo == 'C') {
				c += quantia;
			}
			else if (tipo == 'R') {
				r += quantia;
			}
			else {
				s += quantia;
			}
		}
		int cobaias = c + r + s;
		
		double perC = (double) c / cobaias * 100.0;
		double perR = (double) r / cobaias * 100.0;
		double perS = (double) s / cobaias * 100.0;
		
		System.out.println("Total: "+cobaias+" cobaias");
		System.out.println("Total de coelhos: "+c);
		System.out.println("Total de ratos: "+r);
		System.out.println("Total de sapos: "+s);
		System.out.printf("Percentual de coelhos: %.2f %%%n",perC);
		System.out.printf("Percentual de ratos: %.2f %%%n",perR);
		System.out.printf("Percentual de sapos: %.2f %%%n",perS);
		sc.close();
	}
}
