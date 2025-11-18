package javaProgramiz;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

	public static void main(String[] args) {
String str="nique";
System.out.println(hasUniueChar(str)? "All unique" : "Duplicate exist");
	}

	private static boolean hasUniueChar(String str) {
		Set<Character> charc = new HashSet<>();
		for (char ch : str.toCharArray()) {
			if (!charc.add(ch))
				return false;
		}
		return true;
	}
}
