import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] produto = new String [n];
		double[] compra = new double [n];
		double[] venda = new double [n];
		
		for (int i=0; i<n; i++) {
			produto[i] = sc.next();
			compra[i] = sc.nextDouble();
			venda[i] = sc.nextDouble();
		}
		int countAbaixo = 0;
		int countEntre = 0;
		int countAcima = 0;
		
		for (int i=0; i<n; i++) {
			
			double lucro = venda[i] - compra[i];
			double porcentagemLucro = lucro / compra[i] * 100;
			
			if (porcentagemLucro < 10.0) {
				countAbaixo++;
			}
			else if (porcentagemLucro >= 10.0 && porcentagemLucro <= 20.0) {
				countEntre++;
			}
			else {
				countAcima++;
			}
		}
		System.out.println("Lucro abaixo de 10%: " +countAbaixo);
		System.out.println("Lucro entre 10% e 20%: " +countEntre);
		System.out.println("Lucro acima de 20%: " +countAcima);
		
		double somaCompra = 0;
		
		for (double valorCompra : compra) {
			somaCompra += valorCompra;
		}
		System.out.printf("Valor total de compra: %.2f%n", somaCompra);
		
		double somaVenda = 0;
		
		for (double valorVenda : venda) {
			somaVenda += valorVenda;
		}
		System.out.printf("Valor total de venda: %.2f%n", somaVenda);
		
		double lucroTotal = 0;
		
		for (int i=0; i<n; i++) {
			lucroTotal += venda[i] - compra[i];
		}
		System.out.printf("Lucro total: %.2f", lucroTotal);

		sc.close();
	}

}
