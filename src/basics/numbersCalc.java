package basics;

public class numbersCalc {
	public static void main(String[] args) {
		System.out.println("The program is starting!");
		printName();
		int numA = 10;
		int numB = 20;
		addNumber(numA, numB);
		multiplyNumbers(numA, numB);
		int product = multiplyNumbers(numA, numB);
		System.out.println("The product of numbers " + numA + " and " + numB + " is " +  product);
		
	}
	static void printName() {
		System.out.println("My Name is Tim");
	}
	static void addNumber(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("The Sum of two numbers  " + numberA + " + " + numberB + " is "+ sum);
		//This function will add two numbers
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		addNumber(product + 50, product);
		return product;
	}
}
