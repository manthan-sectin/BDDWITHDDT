package OwnPractice;

public class BubbleSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String arr[] = {"nab","cvf","ser","ooi"};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		
		
		
		}
		System.out.println("Bubble sorted :");
		for(String n:arr) {
			System.out.println(n+" ");
		}
	}

}
