package week1.assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		int var = 154;
		int sum = 0;
		int rem = 0;
		while (var > 0) {
			
			
			rem = var%10;
			sum = sum +rem;
			var = var/10;

		}

		System.out.println("The Sum of digits is "+sum);
	}

}
