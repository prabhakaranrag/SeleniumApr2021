package week1.day2.assignment;

import org.apache.commons.math3.analysis.function.Add;

public class Calculator {

	public int add(int num1, int num2) {

		int result = 0;

		result = num1 + num2;

		return result;
	}
	public double sub(double num1, double num2) {

		double result = 0;

		result = num1 - num2;

		return result;

	}
	public double mul(double num1, double num2) {

		double result = 1;

		result = num1 * num2;

		return result;

	}
	public int divide(int num1, int num2) {

		int result = 1;

		result = num1 / num2;

		return result;

	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Adding 2 numbers is "+calc.add(5,4));
		System.out.println("Subracting 2 numbers is "+calc.sub(50, 35));
		System.out.println("Multiplying 2 numbers is "+calc.mul(33, 55));
		System.out.println("Dividing 2 numbers is "+calc.divide(50, 5));

	}

}
