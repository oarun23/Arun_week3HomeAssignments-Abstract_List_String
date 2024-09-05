package week3.homeassignments1;

import java.util.ArrayList;
import java.util.List;

public class InterSection {
	
	public static void main(String[] args) {
		
	
	int a[] =  {3, 2, 11, 4, 6, 7};
	int b[] =  {1, 2, 8, 4, 9, 7};
	

	List<Integer> a1 = new ArrayList<Integer>();
	List<Integer> a2 = new ArrayList<Integer>();
	
	List<Integer> inSec = new ArrayList<>();
	
	
			for (int i : a) {
				a1.add(i);
			}
			

			for (int i : b) {
				a2.add(i);
			}
	
	for (Integer num : a1) {
		if (a2.contains(num)) {
			inSec.add(num);
		}
	}
	
	System.out.println(inSec);
	
	}
}

