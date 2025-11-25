package OwnPractice;

public class UniqueNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "wwiss";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			boolean unique = true;
			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(j) == c) {
					unique = false;
					break;
				}
			}

			if(unique) {
				System.out.println(c);
				break;
			}
			
			
		}

	}

}
