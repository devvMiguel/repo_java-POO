package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			System.out.println();
			System.out.printf("Rent #%d:%n", i);
			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.next();
			System.out.printf("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy Rooms:");
		for(int i=0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		
		
		sc.close();
	}

}
