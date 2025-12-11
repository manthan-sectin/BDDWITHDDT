package OwnPractice;

import java.util.Arrays;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]
= {1,4,6,7,9,3};
		int remove=6;
		int [] newArr=Arrays.stream(arr).filter(n -> n !=remove).toArray();
		
				System.out.println(Arrays.toString(newArr));
		
		
		
		
	}

}
