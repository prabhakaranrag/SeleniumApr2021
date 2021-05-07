package week1.day1.classroom;

public class Factorial {
int number = 1;
	public int getInput(int input) {
		return input;
	}
	
	public void display() {
		int fact = 1;
		
		
		for (int i = 1; i < getInput(5); i++) {
			
			fact = fact + fact * i; 
			
			
		}
		
		System.out.println("The factorial of the Input "+getInput(5)+" is "+fact);
	}
	public static void main(String[] args) {
		Factorial Fact = new Factorial();
		//Fact.getInput(5);
		Fact.display();

	}

}
