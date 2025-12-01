package OwnPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "nanmm";
	//	StringBuilder sb = new StringBuilder(str);
		Set<Character> first = new LinkedHashSet<>();
		Set<Character> duplicate = new LinkedHashSet<>();
		Set<Character> set = new LinkedHashSet<>();

		for(char c : str.toCharArray()) {
			if(!first.add(c)) {
				duplicate.add(c);
				
				
			}	
		}
		
		System.out.println("Duplicate characters are : ");
		for(char c : duplicate) {
			System.out.println(c + " ");
		}
		
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		
		for (char c : str.toCharArray()) {
			set.add(c);
		

		}
		System.out.println("Unique characters:");
		for (char s : set) {
     System.out.println(s + " ");
		}

	}

}
