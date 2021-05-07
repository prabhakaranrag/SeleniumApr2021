package week1.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";
		
		
		char[] ch = test.toCharArray();
		
		int chlen = ch.length;
		
		for (int i = 0; i < ch.length; i++) {
			
			String uppercase = ""+ch[i];
			if (i % 2 != 0) {
				
			
			uppercase = uppercase.toUpperCase();
				
			}
			System.out.print(uppercase);
		}
		
	}

}
