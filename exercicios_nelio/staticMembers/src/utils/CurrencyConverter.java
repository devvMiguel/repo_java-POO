package utils;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double dollarToReal(double quantity, double price) {
		double priceInReal = quantity * price;
		return priceInReal += IOF * priceInReal;
	}
}
