package javaProgramiz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SeachFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "jack", "jon", "mr", "jack" };
//		String search = "jack";
//		boolean flag = false;
//		for (int i = 0; i < arr.length; i++) {
//			if (search == arr[i]) {
//				System.out.println("Seach found at: " + i);
//				flag = true;
//				break;
//
//			}
//		}
//		if (flag = false) {
//			System.out.println("No search found");
//		}
 
		Set<String> unique=new HashSet<>();
		Set<String> duplicate=new HashSet<>();
		
		for(String s:str) {
			if(!unique.add(s)) {
				duplicate.add(s);
			}
		}
		
		System.out.println("Original arr ay : " +Arrays.toString(str));
		System.out.println("Duplicate elements : " + duplicate);
		
		
	}

}
