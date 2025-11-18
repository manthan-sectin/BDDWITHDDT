package javaProgramiz;

public class StringContainsDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "12345f ghtd23";
		System.out.println(s.matches("\\d+"));
		System.out.println(s.split("\\d+"));
		System.out.println(s.startsWith("12"));
		System.out.println(s.endsWith("2d"));

	}

}
