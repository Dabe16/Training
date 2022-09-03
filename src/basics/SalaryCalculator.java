package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		
		//Declare Variable
		String career;
		System.out.println("Program is Starting");
		career = "Software Engineer";
		System.out.println("My career is: " + career);
		
		//declare and define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek*weeksPerYear*rate;
		System.out.println("My Salary as a " + career + " at the rate of " + rate + " per hour is " + salary + " per Year.");
		// Compute out annual Salary
		// rate*hours*weeks per year
		
		
	}

}
