package week3.homeassignments1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		
		
		String test = "changeme";
		
		char [] charTest = test.toCharArray();
		
		for (int i = 0; i < charTest.length; i++) {
			if(i%2!=0) {
			
			charTest[i] = Character.toUpperCase(charTest[i]);
			}
		}

		System.out.println(charTest);
		
	}

}
