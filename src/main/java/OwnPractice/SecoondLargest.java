package OwnPractice;

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
		
		
		
		
		
		// TODO Auto-generated method stub

		
	}

}
