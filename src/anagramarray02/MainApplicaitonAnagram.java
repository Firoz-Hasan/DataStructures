package anagramarray02;

import java.util.ArrayList;
import java.util.List;

public class MainApplicaitonAnagram {
	
/*
 *  Question #2: Array

Construct an algorithm to check whether two words (or phrases) are anagrams or not!

"An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once"

 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> anagram = new ArrayList<String>();
		anagram.add("restful");
		anagram.add("fluster");
		AnagramArray anagramArray = new AnagramArray();
		boolean result = anagramArray.anagramChecker(anagram);
		
		System.out.println(result);
		
		
	}

}
