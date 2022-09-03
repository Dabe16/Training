package lab2;

public class StudentDatabase {

	public static void main(String[] args) {
		
		newStudent acc1 = new newStudent("12331213", 50000);
		
		acc1.setName("Dave Solatre");
		System.out.println(acc1.getName());
		acc1.setCourse("BSCPE");
		System.out.println("Course: " + acc1.getCourse());
		acc1.setPhoneNumber("09398038595");
		System.out.println("Phone Number: " + acc1.getPhoneNumber() );
		acc1.setDepartment("College of Engineering and Architecture");
		System.out.println("Department: " + acc1.getDepartment());
		
		acc1.checkBalance();
		acc1.pay(1000);
		acc1.getCourse();
		System.out.println(acc1.toString());
		
		
	}

}

class newStudent {
	
	private static int ID = 1001;
	private static String studentID; // ID + 4 random digit between 1000-9000 + last 4 digits - ssn
	private String SSN;
	private String course;
	private String name;
	private String phoneNumber;
	private String department;
	private double checkBalance;
	private double balance = 10000;
	private String [] cources = {" IT " , "Computer Engineer" , "Civil Engineer" , "Architecture"};
	
	

	
	
	public  newStudent(String SSN, double initBalance) { 
		System.out.println("New Student");
		checkBalance = balance;
		this.SSN = SSN;
		ID++;
		setStudentID();
	}
	private void setStudentID() {
		int random = (int) (Math.floor(1000 + Math.random()* 9000 ));
		studentID = ID + "" + random + SSN.substring(4,8);
		//System.out.println(random);
		System.out.println("Your ID Number: " + studentID);
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	public void setPhoneNumber(String phoneNumber) {
		 this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	
	public void enroll(String[] cources) {
		System.out.println("You are now officially enrolled in Bachelor of " + cources);
		showCource(course);
		
	}
	public void pay(double amount) {
		balance = balance - amount;
		System.out.println("You pay amount of " + amount + " for your enrollment fee");
		showActivity(studentID);
	}
	private void showActivity(String Activity) {
		System.out.println("Your Balance is: " + balance);
		
	}
	
	public void checkBalance() {
		System.out.println("Your Tuition fee: " + balance);
		
	}
	@Override
	public String toString() {
		System.out.println("YOU ARE NOW OFFICIALLY ENROLLED");
		return "Name: " + name + ".\nYour ID number: " + studentID + ".\nYour New Balance: " + balance;
	}
	
	public String showCource(String courses) {
		return courses;
		
	}
	
	
}