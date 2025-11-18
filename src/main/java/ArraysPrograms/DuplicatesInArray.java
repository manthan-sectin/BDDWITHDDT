package ArraysPrograms;

import java.util.HashSet;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {1,2,2,3,5,6};
		HashSet<Integer> set=new HashSet<>();
		for(int n:arr) {
			if(!set.add(n)) {
				System.out.println("Duplicates " +n);
			}
		}
		
		
		
		
		
		
		
	}

}
