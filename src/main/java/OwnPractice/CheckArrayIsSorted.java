package OwnPractice;

public class CheckArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = {10,50, 20, 30, 40};

	        boolean sorted = true;
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < arr[i-1]) {
	                sorted = false;
	                break;
	            }
	        }
	        System.out.println("Is sorted: " + sorted);
	}

}
