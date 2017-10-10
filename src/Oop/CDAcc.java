package Oop;

public class CDAcc extends BankAccount implements IRate{
	
	String interestRate;
	
	void compount() {
		System.out.println("Compunding Interest");
	}

}
