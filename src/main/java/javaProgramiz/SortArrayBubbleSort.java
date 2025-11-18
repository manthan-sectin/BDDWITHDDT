package javaProgramiz;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] arr = {10, 25, 8, 35, 15};

		        for (int i = 0; i < arr.length - 1; i++) {
		            for (int j = 0; j < arr.length - i - 1; j++) {
		                if (arr[j] > arr[j + 1]) { // ascending order
		                    int temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
		            }
		        }

		       //
		        System.out.print("Bubble Sorted: ");
		        for (int n : arr) System.out.print(n + " ");
		        //reverse
		        Integer[] arrr = {10, 25, 8, 35, 15};
		        Arrays.sort(arrr,Collections.reverseOrder());

		        System.out.println("Descending: " + Arrays.toString(arrr));
		}
		    }
	

