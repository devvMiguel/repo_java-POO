package entities;

public class Student {

	public String name;
	public double quarterOne;
	public double quarterTwo;
	public double quarterThree;
	
	public double finalGrade() {
		double grade = quarterOne + quarterTwo + quarterThree;
		return grade;
	}
	
	public String finalResult() {
		if (finalGrade() >= 60.00) {
			return "PASS";
		}
		else {
			return "FAILED";
		}
	}
	
	public double missingGrade() {
		return 60 - finalGrade();
	}
	
}
