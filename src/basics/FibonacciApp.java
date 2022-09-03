package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		//Fibonacci number is define by the sum of two previous fibonacci numbers
		//fib(0) = 0
		//fib(1) = 1
		//fib(2) =fib(1) + fib(0) 

		System.out.println(fib(5));
	}

	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return ( ((fib(n-1)) + (fib(n-2))) );
	}
}
