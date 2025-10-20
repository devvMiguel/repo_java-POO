import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();

		if (x1 == 0.0 && y1 == 0.0) {
			System.out.println("Origem");
		} else if (x1 == 0.0) {
			System.out.println("Eixo Y");
		} else if (y1 == 0.0) {
			System.out.println("Eixo X");
		} else if (x1 > 0.0 && y1 > 0.0) {
			System.out.println("Q1");
		} else if (x1 > 0.0 && y1 < 0.0) {
			System.out.println("Q4");
		} else if (x1 < 0 && y1 > 0.0) {
			System.out.println("Q2");
		} else {
			System.out.println("Q3");
		}

		sc.close();
	}
}