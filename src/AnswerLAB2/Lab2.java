package AnswerLAB2;

public class Lab2 {

	public static void main(String[] args) {
		//create Student
		student stu1 = new student("Dave", "908973123");
		student stu2 = new student("Joel", "131231332");
		student stu3 = new student("DAnica", "131314132");
		
		
		stu1.enroll("Math 51");
		stu1.enroll("English101");
		stu1.enroll("Science23");
		
		//stu1.showCources();
		stu1.checkBalance();
		stu1.payTuition(600);
		//stu1.checkBalance();
		
		System.out.println(stu1.toString());
	}

}

class student{ 
	//properties
	private static int ID =0;
	private String userId;
	private String name;
	private String phone;
	private String city;
	private String State;
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	private String SSN;
	private String email;
	public String cources = "";
	private static final int costOfCource = 800;
	private int balance;
	
	
	public student(String name, String SSN) {
		ID++;
		this.name = name;
		this.SSN = SSN;
		setUserId();
		setEmail();
		
	}
	private void setEmail() {
		email = name.toLowerCase() +"." + ID + "@yahoo.com";
		System.out.println("Your email: " + email);
	}
	
	public String getEmail(){
		return email;
	}
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int ranNum = (int) (Math.random() * ((max - min)));
		ranNum = ranNum + min;
		userId = ID + ranNum + SSN.substring(6);
		System.out.println("Your account number: " + userId);
	}
	
	public void enroll(String cource) {
		this.cources = this.cources + " " + cource;
		balance = balance + costOfCource;
		
	}
	public void payTuition(int amount){
		System.out.println("Payment: " + amount);
		balance = balance - amount;
	
	}
	public void checkBalance() {
		System.out.println("Balance: " + balance);
		
	}
	public void showCources() {
		System.out.println(cources);
		
	}
	public String toString() {
		System.out.println("=============================");
		return "Name" + name + "\nCources: " + cources + "\nBalance: " + balance;
	}
}

