package oop;

class Person {
	
	String name; 
	String email;
	String phone;
	int age;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	void yahoo() {
		System.out.println(email);
	}
	void Age() {
		System.out.println(name + " age is " + age);
	}
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	void phoneNumber() {
		System.out.println("your phone number is " + phone);
	}
}

public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		//Define some  properties
		person1.name = "Dave";
		person1.email = "dave.solatre@yahoo.com.ph";
		person1.phone = "09398038595";
		person1.age = 22;
		
		//Abstraction
		person1.walk();
		person1.Age();
		person1.yahoo();
		person1.phoneNumber();
			

		Person person2 = new Person();
		
		person2.name = "Joel";
		person2.email = "Joelsolatre@yahoo.com";
		person2.phone = "09999965327";
		person2.age = 58;
		
		
		person2.walk();
		person2.Age();
		person2.yahoo();
		person2.phoneNumber();
		
		
	}

}
