package javaProgramiz;

import java.util.Arrays;
import java.util.Collections;

public class FirstSecondMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = {10, 25, 8, 35, 15, 42, 30, 50};
          int six=Integer.MAX_VALUE;
	        int first = Integer.MAX_VALUE;
	        int second = Integer.MAX_VALUE;
	        int third = Integer.MAX_VALUE;
	        int fourth = Integer.MAX_VALUE;

	        for (int num : arr) {
	            if (num < first) {
	                fourth = third;
	                third = second;
	                second = first;
	                first = num;
	            } else if (num < second && num != first) {
	                fourth = third;
	                third = second;
	                second = num;
	            } else if (num < third && num != second && num != first) {
	                fourth = third;
	                third = num;
	            } else if (num < fourth && num != third && num != second && num != first) {
	                fourth = num;
	            }
	        }

	        System.out.println("1st Min: " + first);
	        System.out.println("2nd Min: " + second);
	        System.out.println("3rd Min: " + third);
	        System.out.println("4th Min: " + fourth);
	        
	}    

}
