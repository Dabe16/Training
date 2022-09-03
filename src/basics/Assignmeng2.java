package basics;


public class Assignmeng2 {
public static void main(String[] args) 
	{
	System.out.println(sum(6));
	}


	public static int sum(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(sum + " + " +  i);
			sum = sum + i ;
			System.out.println(" = " + sum);
		}
		return sum;
	}
}
