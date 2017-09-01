package basic;

public class SalaryCalculator {
	public static void main(String[] args){
		//Let's create a variable to store our salary.
		
		//Declare a variable 
		String career;
		System.out.println("Program is starting");
		
		//Defined a variable
		career = "Software Developer";
		System.out.println("My career is as a " + career);
		
		//Declare and define 
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My Salary as a " + career + " at the rate of R" + rate + " per hour is R" + salary + " per year.");
		
		//Compute our annual salary 
		//rate * hours per week * week per year
	}
}
