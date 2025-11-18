package ArraysPrograms;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 2, 4, 6 };
		int[] arr2 = { 2, 5, 8, 9 };
		for (int i = arr1.length - 1; i >= 0; i--) {
			if (arr1[i] > arr2[0]) {
				int temp = arr1[i];
				arr1[i] = arr2[0];
				arr2[0] = temp;
				Arrays.sort(arr2);

			}

		}

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

}
