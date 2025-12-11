package OwnPractice;

public class SpecialChar {

	public static void main(String[] args) {

		String str = "QWrteEF23@#&^";
		int spec = 0;
		int upper = 0;
		int lower = 0;
		int letter = 0;
		int digit = 0;
		int spaces = 0;
		for (char c : str.toCharArray()) {
			if (!Character.isLetterOrDigit(c)) {
				spec++;
			}
			if (Character.isUpperCase(c)) {
				upper++;
			}
			if (Character.isLowerCase(c)) {
				lower++;
			}

			if (Character.isLetter(c)) {
				letter++;

			}
			if (Character.isDigit(c)) {
				digit++;
			}

			if (Character.isSpaceChar(c)) {
				spaces++;
			}

		}
		System.out.println(spec);
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(spaces);
		System.out.println(str.replaceAll("\\d", ""));

		System.out.println(str.replaceAll("\\D", ""));
		// TODO Auto-generated method stub

	}

}
