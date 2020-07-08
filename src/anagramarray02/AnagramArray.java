package anagramarray02;

import java.util.Arrays;
import java.util.List;

public class AnagramArray {

	public boolean anagramChecker (List<String> anagramWord ) {
		
		String first = anagramWord.get(0);
		String second = anagramWord.get(1);
		
		char[] firstCharArray = first.toCharArray();
		char[] secCharArray = second.toCharArray();
		
		
		
		
		//System.out.println(firstCharArray[0]+" "+second);
		
		
		
		return checkCharArray(firstCharArray, secCharArray);
		
	}

	private boolean checkCharArray(char[] firstCharArray, char[] secCharArray) {
		// TODO Auto-generated method stub
		
		if(firstCharArray.length != secCharArray.length) {
			return false;
		}
			
		Arrays.sort(firstCharArray);
		Arrays.sort(secCharArray);
	
		
	 for (int i = 0; i< firstCharArray.length; i++) {
		 if(firstCharArray[i] != secCharArray[i]) {
			 return false;
		 }
		 
	 }
	 
	 return true;
		
		
	}


}
