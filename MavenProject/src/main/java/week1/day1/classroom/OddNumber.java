package week1.day1.classroom;

public class OddNumber {
	
	public void displayOddNumber() {
		System.out.println("Printing only the odd numbers from 1 to 20 ");
		for (int i = 1; i < 20; i+=2) {
			
			
			System.out.println(i);
			
		}

	}

	public static void main(String[] args) {
		OddNumber odd = new OddNumber();
		odd.displayOddNumber();
	}

}
