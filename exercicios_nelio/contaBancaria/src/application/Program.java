package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		
		BankAccount account;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double initialDeposit = 0.00;
		
		System.out.print("Enter the account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter the account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char yesOrNo = sc.nextLine().charAt(0);
		
		if(yesOrNo == 'y') {
			System.out.printf("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
			account = new BankAccount(number, name, initialDeposit);
		}
		else {
			account = new BankAccount(number, name);
		}
		System.out.println();		
		
		System.out.println("Account data:");
		System.out.println(account.toString());
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		account.deposit(value);
		
		System.out.println("Updated account data:");
		System.out.println(account.toString());
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		account.withdraw(value);
		
		System.out.println("Updated account data");
		System.out.println(account.toString());
		
		sc.close();
	}

}
