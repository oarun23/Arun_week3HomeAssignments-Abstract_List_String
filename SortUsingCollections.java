package week3.homeassignments1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class SortUsingCollections {
 
	public static void main(String[] args) {
		
		
		String [] value = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> valueList = new ArrayList<>();
		
		for (String newValue : value) {
			
			valueList.add(newValue);
		}
						
		Collections.sort(valueList, Collections.reverseOrder());
		System.out.println(valueList);
	}
 
}