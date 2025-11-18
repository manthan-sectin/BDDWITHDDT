package OwnPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="madavvm";
		StringBuilder sb=new StringBuilder();
		Set<Character> seen=new LinkedHashSet<>();
		Set<Character> dup=new LinkedHashSet<>();
		for(char c:str.toCharArray()) {
			if(seen.add(c)) {
				sb.append(c);
			}
			else {
				dup.add(c);
			}
		}
		System.out.println(seen);
		System.out.println(sb.toString());
		System.out.println(dup);
		
		
		
		
		
		
	}

}
