package OwnPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mantha";
		 StringBuilder sb = new StringBuilder();

//	        boolean[] seen = new boolean[256];
//
//	        for (char c : s.toCharArray()) {
//	            if (!seen[c]) {
//	                seen[c] = true;
//	                sb.append(c);
//	            }
//	        }
//
//	        System.out.println(sb.toString());
		 //remove duplicates only
		 Set<Character> seen=new LinkedHashSet<>();
		 /*		 for(char c:s.toCharArray()) {
			 if(seen.add(c)) {
				 sb.append(c);
			 }
			 
			 
		 }System.out.println(sb.toString());
		 */
		 //keep duplicate
		 Set<Character> duplicate=new LinkedHashSet<>();
		 for(char c:s.toCharArray()) {
			 if(!seen.add(c)) {
				 duplicate.add(c);
			 }
			 
		 }
		 for(char d:duplicate) {
			 sb.append(d);
		 }
		 System.out.println(sb.toString());
	    }
	}

