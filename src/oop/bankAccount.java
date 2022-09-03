package oop;

public class bankAccount implements  IRate {
	//Define Variables
	String accountNumber;
	
	
	//Static>> belong to the class not object instance
	//final >> constant (often static final)
	private static final String routingNumber = "0731231812";
	
	//Instance Variables
	private String name;
	private String SSS;
	String accountType;
	double balance;
	
	
	//Constructor Definitions: unique methods
		//1. They are used to define  / setup / initialize properties of an object
		//2.Constructors are IMPLICITLY called upon INSTANTIATION
		//3. The same name as the class itself
		//4. Constructors have NO return type
	bankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
		
	}
	
	//OVERLOADING: call same method name with  different argument
	bankAccount(String accountType){
		System.out.println("New Account: " + accountType);
		
	}
	bankAccount(String accountType, double initDeposit ){
		System.out.println("New Account: " + accountType);
		System.out.println("Initial Deposit of:  $" + initDeposit);
		String msg = null;
		if(initDeposit < 1000) {
			msg = "ERROR: minimum deposit must atleast of 1000";
		}else {
			msg = "Thanks for initial Deposit of " + initDeposit;
		}
		System.out.println(msg);
		balance = initDeposit;
	}
	
	
	//getter and setters
	
	//Allow the users to define name
	public void setName(String name) {
		this.name = "Mr." + name;
	}
	public String getName() {
		return name;
	}
	
	public String getSSS() {
		return SSS;
	}

	public void setSSS(String sSS) {
		SSS = sSS;
	}
	
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void inceaseRate() {
		System.out.println("Increasing Rate");
	}

	//Define Methods
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
		 
		
	}
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("Withdraw");
		
	}
	
	private void showActivity(String activity) {
		System.out.println("your Recent Transaction: " + activity);
		System.out.println("Your New Balance: " + balance);
	}
	void chackBalance() {
		System.out.println("Balance: " + balance);
	}
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		System.out.println("Your updated Account");
		return "NAME: " + name + ".\nAccount#: " + accountNumber + ".\nRouting Number: " + routingNumber + ".\nBALANCE: $" + balance;
	}

	@Override
	public void increaseRate() {
		// TODO Auto-generated method stub
		
	}
}
