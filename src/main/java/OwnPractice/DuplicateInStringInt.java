package OwnPractice;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateInStringInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"man","man","aer","dfd"};
		HashSet <String> unique=new HashSet<>();
		HashSet<String> dup=new HashSet<>();
		for(String s:arr) {
			if(!unique.add(s)) {
				dup.add(s);
				
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Duplicate are : " +dup);
		
	//Only add int for numeric values	
	}

}
