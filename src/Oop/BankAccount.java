package Oop;

public class BankAccount implements IRate {
	
	String accountnumber;
	private static final String routingnumber="123321";
	private String name;
	private String SSN;
	String accounttype;
	double balance=0;
	
	
	BankAccount() {
		System.out.println("New account created!");
	}
	
	BankAccount(String accounttype) {
		System.out.println("The new account is: " + accounttype);
	}
	
	BankAccount(String accounttype, double initdeposit) {
		System.out.println("The new account is: " + accounttype);
		System.out.println("Initial deposit of: $" + initdeposit);
		String Msg=null;
		if (initdeposit<1000) {
			Msg ="Error! Minimum deposit has to be 1000$";
		}
		else {
			Msg = ("Thanks for you initial deposit of: $" + initdeposit) ;
		}
		System.out.println(Msg);		
		balance=initdeposit;
	}
	public void deposit(double amount) {
		balance= balance+amount;
		showActiv("Deposit");
		
	}
	public void setRate() {
		System.out.println("Setting rate: ");
	}
	public void increaseRate() {
		System.out.println("Increasing rate: ");
	}
	
	
	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public void setName(String name) {
		this.name=name;
	}
	public String getName(){
		return name;
	}
	void withdraw(double amount) {
		balance = balance+amount;
		showActiv("Withdraw");
	
	}
	
	void checkbalance() {
		System.out.println("The balance is: " + balance);
		
		
	}
	
	private void showActiv(String activity){
		System.out.println("Your recent transaction: " + activity);
		System.out.println("Your new balance is: $" +balance);
	}
	
	void getStatus() {
		
		
	}
	public String toString() {
		return " [ " +"Name: "  +name +" Acc.number: " + accountnumber + " Routing number: " +routingnumber +" ,your balance is: $" +balance +" ] ";
	}
}
