package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.quarterOne = sc.nextDouble();
		student.quarterTwo = sc.nextDouble();
		student.quarterThree = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		System.out.println(student.finalResult());
		
		if (student.finalGrade() < 60.00) {
			System.out.printf("MISSING %.2f POINTS", student.missingGrade());
		}
		
		sc.close();
	}

}
