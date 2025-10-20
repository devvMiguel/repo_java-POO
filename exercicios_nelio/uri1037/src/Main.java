import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double inter = sc.nextDouble();
		
		if (inter < 0.0 || inter > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if( inter <= 25.00) {
			System.out.println("Intervalo [0,25]");
		}
		else if(inter <= 50.00) {
			System.out.println("Intervalo (25,50]");
		}
		else if (inter <= 75.00) {
			System.out.println("Intervalo (50,75]");
		}
		else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();
	}
}