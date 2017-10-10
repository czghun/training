package Oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1= new BankAccount();
		acc1.accountnumber = "1233321213132";
		//acc1.name ="Roger Waters";
		acc1.balance= 100000;
		acc1.setName("Roger Waterz");
		System.out.println(acc1.getName());
		acc1.deposit(113330);
		acc1.deposit(113330);
		acc1.deposit(113330);
		acc1.withdraw(2005);
		acc1.setSSN("12312312312");
		System.out.println("SSN: " + acc1.getSSN());
		acc1.setRate();
		acc1.increaseRate();

		
		System.out.println(acc1.toString());
		
		/*
		BankAccount acc2= new BankAccount("Checking account");
		acc2.accountnumber = "1233321213132";
		
		
		BankAccount acc3= new BankAccount("Savings account", 1000);
		acc3.accountnumber = "1233321213132";
		acc3.checkbalance();
		
	
		System.out.println(acc1.routingnumber);
		System.out.println(acc2.routingnumber);
		System.out.println(acc3.routingnumber);
		
		CDAcc cd1 = new CDAcc();
		cd1.name = "Gyõzõ";
		cd1.interestRate = "4.5";
		cd1.balance = 20000;
		cd1.accounttype = "Cd account";
		System.out.println(cd1.toString());
		cd1.compount();
		*/

	}

}
