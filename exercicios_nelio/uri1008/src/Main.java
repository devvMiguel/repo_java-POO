import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner(System.in);

		int numFun = sc.nextInt();
		int numHoras = sc.nextInt();
		double valorHoras = sc.nextDouble();
		double salario = numHoras * valorHoras;

		System.out.println("NUMBER = " + numFun);
		System.out.printf("SALARY = U$ %.2f%n" , salario);

		sc.close();
	}

}
