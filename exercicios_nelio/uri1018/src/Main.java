import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int N, result , resto, nota;
		
		N = sc.nextInt();
		System.out.println(N);
		
		resto = N ;
				
		nota = 100;
		result = resto / nota;
		System.out.println(result + " nota (s) de R$" + nota + ",00");
		resto = resto % nota;
		
		nota = 50;
		result = resto / nota;
		System.out.println(result + " nota (s) de R$" + nota + ",00");
		resto = resto % nota;
		
		nota = 20;
		result = resto / nota;
		System.out.println(result + " nota (s) de R$" + nota + ",00");
		resto = resto % nota;
		
		nota = 10;
		result = resto / nota;
		System.out.println(result + " nota (s) de R$" + nota + ",00");
		resto = resto % nota;
		
		nota = 5;
		result = resto / nota;
		System.out.println(result + " nota (s) de R$" + nota + ",00");
		resto = resto % nota;
		
		nota = 2;
		result = resto / nota;
		System.out.println(result + " nota (s) de R$" + nota + ",00");
		resto = resto % nota;
		
		System.out.println(resto + " nota (s) de R$ 1,00");
		
		
		
		
		sc.close();
	}

}
