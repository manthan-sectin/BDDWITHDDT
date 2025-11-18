package OwnPractice;

public class UpperLowerspaceSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "asAS123!@#";

		int upper = 0;
		int lower = 0;
		int special = 0;
		int space = 0;
		int digit = 0;

		for(char c : str.toCharArray()) {
		    
		    // print each character separately
		    System.out.println("Character: " + c);

		    if(Character.isUpperCase(c)) {
		        upper++;
		        System.out.println(" → Uppercase");
		    }
		    else if(Character.isLowerCase(c)) {
		        lower++;
		        System.out.println(" → Lowercase");
		    }
		    else if(Character.isDigit(c)) {
		        digit++;
		        System.out.println(" → Digit");
		    }
		    else if(Character.isWhitespace(c)) {
		        space++;
		        System.out.println(" → Space");
		    }
		    else {
		        special++;
		        System.out.println(" → Special Character");
		    }

		    System.out.println("-------------------------");
		}

		System.out.println("Uppercase: " + upper);
		System.out.println("Lowercase: " + lower);
		System.out.println("Digits: " + digit);
		System.out.println("Spaces: " + space);
		System.out.println("Special: " + special);

	}

}
