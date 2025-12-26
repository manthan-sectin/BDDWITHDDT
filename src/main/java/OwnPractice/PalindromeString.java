package OwnPractice;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="madfam";
		//String str="A man, a plan, a canal panama";
		String t=str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		System.out.println(new StringBuilder(t).reverse().toString().equals(t));
		
		
		
		
		
		
		
		
		
		
	}

}
