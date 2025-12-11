package OwnPractice;

import java.util.Arrays;

public class SecoondLargest {

	public static void main(String[] args) {

		
		
		int arr[]
= {1,3,4,6,88,9};
		int larg=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int n:arr) {
			if(n>larg) {
				second=larg;
				larg=n;
			}
			
			else if(n>second && n!=larg) {
				second=n;
				
			}
			
		}
		System.out.println(second);
		System.out.println(larg);
		
		/////////////////////////////////////////////////////////////
		///
		///
		///
		///
	
		 int[] arr1 = {10, 20, 4, 45, 99};
		Arrays.sort(arr1);
        System.out.println(arr1[arr1.length - 3]);
		
		
		
		
		// TODO Auto-generated method stub

		
	}

}
