package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.printf("How many dollars will be bought? ");
		double amountDollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.dollarToReal(amountDollar, dollarPrice));
		
		sc.close();
	}

}
