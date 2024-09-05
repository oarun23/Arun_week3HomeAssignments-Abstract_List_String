package week3.homeassignments1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 
public class MissingElement {
 
	public static void main(String[] args) {
 
		int [] a =  {1, 2, 3, 4, 10, 6, 8};
 
		List<Integer> value = new ArrayList<>();
 
 
		Collections.sort(value);
 
 
		for (Integer newValue : a) {
 
			value.add(newValue);
 
 
		}
 
 
		Collections.sort(value);
 
		System.out.println(value);
 
       
 
 
	}
 
}