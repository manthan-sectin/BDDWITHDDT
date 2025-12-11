package OwnPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "programming";
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
		 
		 Set<Character> seen=new LinkedHashSet<>();
		 for(char c:s.toCharArray()) {
			 if(seen.add(c)) {
				 sb.append(c);
			 }
			 
			 
		 }System.out.println(sb.toString());
		 
		 
		 
	    }
	}

