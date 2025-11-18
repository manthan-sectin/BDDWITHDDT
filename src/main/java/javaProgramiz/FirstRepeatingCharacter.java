package javaProgramiz;

public class FirstRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "swiss";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean repeating = false;
            
            for (int j = 0; j < i; j++) {  // check only previous chars
                if (s.charAt(j) == c) {
                    repeating = true;
                    break;
                }
            }
            
            if (repeating) {
                System.out.println(c);
                break;
            }
        }}}


