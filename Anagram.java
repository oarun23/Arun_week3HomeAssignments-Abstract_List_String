package week3.homeassignments1;

import java.util.Arrays;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class Anagram {

	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss";
		
		
		if(text1.length()== text2.length()) {
			
		char [] charr1 = text1.toCharArray();
		
		char [] charr2 = text2.toCharArray();
		
		Arrays.sort(charr1);
		Arrays.sort(charr2);
		
		if(Arrays.equals(charr1, charr2)) {
			
			System.out.println("Given Strings are Anagram");
		}else {
			System.out.println("Given Strings are not Anagram");
		}
			
		}
		
		
		else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
					}

	}

}
