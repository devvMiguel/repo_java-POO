import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
		
			int horas = sc.nextInt();
			int velomedia = sc.nextInt();
			double litros = 0;
			
			
			
			litros = velomedia * horas / 12.0;
			
			
			
			System.out.printf("%.3f%n", litros);
			
			
			
			
			sc.close();
	}

}
