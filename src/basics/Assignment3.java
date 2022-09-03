package basics;

public class Assignment3 {
	public static void main(String[] args) {

		
		int [] numbers = {12, -5, 0, 56 ,42};
		System.out.println("Min: " + findMin(numbers));
		System.out.println("Max: " + findMax(numbers));
		
		System.out.println("AVG: " + findAvg(numbers));
	}
	
	public static int findAvg(int[] arr) {
		int sum = 0;
		for (int n = 0; n < arr.length; n++) {
			sum = sum + arr[n];
			
		}
		System.out.println("Sum: " + sum);
		return sum/arr.length;
	}
	 public static int findMin(int[] arr) {
		 int min = arr[0];
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i] < min) {
				 min = arr[i];
			 }
		 }
		 return min;
	 }
	 public static int findMax(int[] arr) {
		 int max = arr[0];
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i] > max) {
				 max = arr[i];
			 }
		 }
		 return max;
	 }
}

