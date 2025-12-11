package OwnPractice;

import java.util.Arrays;

public class SortCharacterAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Str="prgramming";
	char[] arr=Str.toCharArray();
//		Arrays.sort(arr);
//
//		String sorted=new String(arr);
//		System.out.println(sorted);
//		
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			
			
			
		}
		
	}
		
	System.out.println(new String(arr));	
	}

}
