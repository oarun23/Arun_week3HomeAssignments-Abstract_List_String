package week3.homeassignments1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		String text = "We learn Java basics as part of java sessions in java week1";
		
		int count=0;
		
	
		String[] splitWord = text.split(" ");
				
		  for (int i = 0; i < splitWord.length; i++) {
	            for (int j = i + 1; j < splitWord.length; j++) {
	                if (splitWord[i].equalsIgnoreCase(splitWord[j])) {
	                	splitWord[j] = "";
	                    count++;
	                }
	            }
	        }
		
		  if (count > 1) {
	                for (String updatedWord : splitWord) {
	                System.out.print(updatedWord + " ");
	            }

	}
}
}

