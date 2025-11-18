package javaProgramiz;

public class CountSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abababdfrt";
		String sub = "ab";
		int count = 0, index = 0;

		while ((index = s.indexOf(sub, index)) != -1) {
			count++;
			index += sub.length();
		}

		System.out.println(count);

	}

}
