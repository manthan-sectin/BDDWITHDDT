package OwnPractice;

public class RemoveSpecialCharAndSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="AD sfdf!@#123";
System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
System.out.println(str.replace(" ", ""));		
		
		
		
		
	}

}
