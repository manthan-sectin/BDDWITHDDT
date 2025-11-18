package javaProgramiz;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	
	String str1="listen";
	String str2="silent";
//	if(str1.length()!=str2.length()) {
//		System.out.println("not anagram");
//		return;
//		
//	}
	char[] a1=str1.toCharArray();
	char[] a2=str2.toCharArray();
	Arrays.sort(a1);
	Arrays.sort(a2);
	
	if(Arrays.equals(a1, a2))
	{
		System.out.println("Anagram");
	}
	else {
		System.out.println("not anagram");
	}
}
}
