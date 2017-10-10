package labs;

import Oop.IInterest;

public class BankAccountApp {
	public static void main (String[] args){
		BankAccount acc1= new BankAccount("12234455", 1000);
		BankAccount acc2= new BankAccount("98234455", 2000);
		BankAccount acc3= new BankAccount("43334455", 2500);
		
		
		acc1.setName("Jani");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(850);
		acc1.payBill(1100);
		acc1.accrue();
		System.out.println(acc1.toString());
		
				
	}

}

class BankAccount implements IInterest{
	private String name;
	private String SSN;
	private static final String routingNumber= "0022113";
	private String accountNumber;
	private double balance;
	private static int ID=1000;

	public BankAccount(String SSN, double initDeposit){
		//System.out.println("New account created: ");
		balance=initDeposit;
		ID++;
		this.SSN=SSN;
		//System.out.println(ID);
		SetAccountNumber();
	}
	private void SetAccountNumber(){
		int random= (int) (Math.random() *100);
		//System.out.println(random);
		accountNumber= ID + "" +random +SSN.substring(0,2);
		System.out.println("Your account number: " +accountNumber);
		
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void payBill(double amount){
		balance=balance-amount;
		System.out.println("Paying bill: "+amount);
		showDepo();
	
	}
	public void makeDeposit(double amount){
		balance=balance+amount;
		System.out.println("Making deposit: "+amount);
		showDepo();
	}
	public void showDepo(){
		System.out.println("Your balance is: "+balance);
	}
	@Override
	public void accrue() {		
		balance= balance*(1+rate/100);
		System.out.println("Your balance whith the rate of"+"("+rate+")"+"is: "+balance );
	}
	public String toString(){
		return "[Name: " +name +"]\n" +"[Account number: " +accountNumber +"]\n" +"[Routing number: "+routingNumber +"]\n" + "[Balance: " +balance +"]\n";
	}
}