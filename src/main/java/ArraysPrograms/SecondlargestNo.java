package ArraysPrograms;

public class SecondlargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 56, 6 };
		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int n : arr) {
			if (n > largest) {
				second = largest;
				largest = n;
			} else if (n > second && n != largest) {
				second = n;
			}

		}
		System.out.println("Second largest : " + second);

	}

}
