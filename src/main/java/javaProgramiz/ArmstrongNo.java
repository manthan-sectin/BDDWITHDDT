package javaProgramiz;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int cube = 0;
		int rem = 0;
		int t = num;
		while (num != 0) {
			rem = num % 10;
			cube = cube + (rem * rem * rem);
			num = num / 10;
		}
		if (t == cube) {
			System.out.println("Armstrong no");
		} else {
			System.out.println("Not armstrog no");
		}
	}

}
