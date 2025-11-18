package javaProgramiz;

import java.util.HashSet;

public class DuplicatesInStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String arr[]= {"man","than","man","an"};
HashSet<String> set=new HashSet<>();
	for(String s:arr){
		if(!set.add(s)) {
			System.out.println("Duplicates are" +s);
		}
	}
		
		
		
		
		
	}

}
