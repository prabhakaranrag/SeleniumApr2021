package week1.day1.classroom;

public class FibonacciSeries {
	public int firstNum = 0;
	public int secNum = 1;
	public int sum = 0;
	public void displayFibonacci() {
		System.out.println("The fibonacci Series is "+ firstNum);
		System.out.println("The fibonacci Series is "+ secNum);
		
		for (int i = 0; i < 6; i++) {
			
			sum = firstNum + secNum;
			
			System.out.println("The fibonacci Series is "+ sum);
			
			firstNum = secNum;
			secNum = sum;
		}
				
	}
	
	public static void main(String[] args) {
		FibonacciSeries febo = new FibonacciSeries();
		febo.displayFibonacci();
	}

}
