package javaProgramiz;

import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Anagram
//		String str1="lifsten";
//		String str2="silent";
//		char[] c1=str1.toCharArray();
//		char[] c2=str2.toCharArray();
//		Arrays.sort(c1);
//		Arrays.sort(c2);
//		if(Arrays.equals(c1, c2)) {
//	    System.out.println("Anagram");
//		}
//		else {
//			System.out.println("Not anagram");
//		}
//		
//		
//		
		
//No repeating first char
		String str="swiwss";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			boolean unique=true;
			for(int j=0;j<str.length();j++) {
				if(i!=j && str.charAt(j)==c) {
					unique=false;
					break;
				}
			}
			
			if(unique) {
				System.out.println(c);
				break;
			}
			
		}
		
		
		
		
	}

}
