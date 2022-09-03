package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		bankAccount acc1 = new bankAccount("31237521231",1000);
		bankAccount acc2 = new bankAccount("31237521231", 2000);
		bankAccount acc3 = new bankAccount("31237521231", 3000);
		
		
		
		acc1.setName("Dave Andrew S. Solatre");
		System.out.println(acc1.getName());
		
		acc1.makeDeposit(500);
		acc1.makeDeposit(500);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());	
	}

}

class bankAccount implements IInterest{
	
	private static int ID = 1001;					//Internal ID
	private String accountNumber; //ID + Random 2-Digit number + first 2 of SSN
	private static final String RoutinNumber = "0054000657";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	
	public bankAccount(String SSN, double initDeposit) { 
		//System.out.println("New Account Created");
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
		
	}
		private void setAccountNumber() {
			int random = (int) (Math.random() * 100);
			//System.out.println(random);
			accountNumber = ID + "" + random + SSN.substring(0,2);
			System.out.println("Your Account Number: " + accountNumber);
		}
		public void setName(String name) {
			this.name = name;
			
		}
		public String getName() {
			return name;
		}
		public void payBill(double amount) {
			balance = balance - amount; 
			System.out.println("Paying Bill: " + amount);
			showBalance();
		}
		public void makeDeposit(double amount) {
			System.out.println("Make Deposit: " + amount);
			balance = balance + amount;
			showBalance();
			
		}
		public void showBalance() {
			System.out.println("Balance:" + balance);
			
		}
		@Override
		public void accrue() {
			balance = balance * (1 +rate/100);
			showBalance();
			
		}
		@Override
		public String toString() {
			return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n" + "Routing Number: " + RoutinNumber + "]\n" + "[Balance: " + balance + "]";	
		}
		
}
