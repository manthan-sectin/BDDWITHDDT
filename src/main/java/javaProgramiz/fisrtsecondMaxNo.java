package javaProgramiz;

public class fisrtsecondMaxNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        int[] arr = {10, 25, 8, 35, 15, 42, 30, 50};
                int six=Integer.MIN_VALUE;
		        int first = Integer.MIN_VALUE;
		        int second = Integer.MIN_VALUE;
		        int third = Integer.MIN_VALUE;
		        int fourth = Integer.MIN_VALUE;

		        for (int num : arr) {
		            if (num > first) {
		                fourth = third;
		                third = second;
		                second = first;
		                first = num;
		            } else if (num > second && num != first) {
		                fourth = third;
		                third = second;
		                second = num;
		            } else if (num > third && num != second && num != first) {
		                fourth = third;
		                third = num;
		            } else if (num > fourth && num != third && num != second && num != first) {
		                fourth = num;
		            }
		        }

		        System.out.println("1st Max: " + first);
		        System.out.println("2nd Max: " + second);
		        System.out.println("3rd Max: " + third);
		        System.out.println("4th Max: " + fourth);
		    }
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
