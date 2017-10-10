package basics;

public class SalaryCalculator {
	public static void main (String[] args){
		String career;
		System.out.println("Program is starting") ;
		career = "Software developer ";
		System.out.println("My career: " + career);
		
		int HoursPerWeek = 40;
		int WeeksPerYear = 50;
		double rate = 42.5;
		
		double Salary = HoursPerWeek * WeeksPerYear * rate;
		System.out.println("My salary as a " + career +"at the rate of $" + rate + " per hour, is $" + Salary + " per year.");
		
	}

}
