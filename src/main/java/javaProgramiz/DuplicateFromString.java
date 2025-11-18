package javaProgramiz;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateFromString {
	public static void main(String[] args) {

	String s = "mannmatth";
	StringBuilder sb = new StringBuilder();
	Set<Character> seen = new LinkedHashSet<>();

	for (char c : s.toCharArray()) 
	    if (seen.add(c))   // add() returns true only if char not seen before
	        sb.append(c);

	System.out.println(sb.toString()); // "ban"

//		String str = "manmade";
//		Set<Character> set = new LinkedHashSet<>();
//		for (char c : str.toCharArray()) {
//			set.add(c);
//		}
//
//		
//		StringBuilder result=new StringBuilder();
//		for(char c:set) {
//			result.append(c);
//		}
//		System.out.println(str);
//		System.out.println(result);
//		
		
		
		
		
		
		
	}
}
