package OwnPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = {"man","than","Ram","man"};
		Set<String> set=new LinkedHashSet<String>();
		for(String s: str) {
			if(!set.add(s)) {
				System.out.println("Unique in string are :" +s);
			}
		}
	}

}
