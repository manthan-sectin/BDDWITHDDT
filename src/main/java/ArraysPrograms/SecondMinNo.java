package ArraysPrograms;

public class SecondMinNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0,1, 2, 3, 4, 56, 6 };
		int largest = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for (int n : arr) {
			if (n < largest) {
				second = largest;
				largest = n;
			} else if (n < second && n != largest) {
				second = n;
			}

		}
		System.out.println("Second lowest : " + second);

	}

}
