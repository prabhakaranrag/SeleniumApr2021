package week1.day2.assignment;
import java.util.Arrays;

public class FindSecondLargest {

	

	public static void main(String[] args) {
	
		int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
		int arrayLength = data.length;
		
		System.out.println("The Second Largets Number is " +data[arrayLength-2]);

	}

}
