package basics;

public class Numbers {
	
	public static void main(String[] args) {
		printName();
		int numA = 10;
		int numB = 20;	
		addNumbers(numA,numB);
		System.out.println("A szorzat eredm�nye a k�vetkez� k�t sz�mnak: " +numA +" illetve: " +numB +" egyenl�:" +multiplyNumbers(numA,numB));
	}
	
	static void printName() {
		System.out.println("My name is Who? My name is WHAT?");
	}
	
	static void addNumbers (int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("The sum of number " + numberA +" and " + numberB +" is " + sum);
	}
	static int multiplyNumbers (int valueA, int valueB){
		int product = valueA * valueB;
		return product;
		
	}
}
