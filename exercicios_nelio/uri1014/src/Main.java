import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

		int km = sc.nextInt();
		double combust = sc.nextDouble();

		double  consumo = km / combust  ; 

		System.out.printf("%.3f km/l%n", consumo);

		sc.close();
	}

}
