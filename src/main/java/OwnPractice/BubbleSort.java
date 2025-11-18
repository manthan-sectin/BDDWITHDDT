package OwnPractice;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,33,44,66,55};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j]+1) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		
		
		
		}
		System.out.println("Bubble sorted :");
		for(int n:arr) {
			System.out.println(n+" ");
		}
		
		
		
		
		
		
		
		
	}

}
