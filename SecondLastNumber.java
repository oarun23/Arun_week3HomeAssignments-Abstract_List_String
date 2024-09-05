package week3.homeassignments1;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
 
 
 
public class SecondLastNumber {
	
public static void main(String[] args) {
	
	
	
	int[] a =  {3, 2, 11, 4, 6, 7};
	
	List<Integer> secondLast = new ArrayList<>();
	
	for (Integer num : a) {
		
		secondLast.add(num);
				
	}
	
	
	Collections.sort(secondLast,Collections.reverseOrder());
	
	System.out.println("The second largest number is "+secondLast.get(1));
	
	
 
}
 
}