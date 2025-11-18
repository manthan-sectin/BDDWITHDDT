package javaProgramiz;

public class CheckPalindrome {
public static void main(String[] args) {
	 

	
	
	String s="madam";
	int length=s.length();
	String rev=" ";
	for(int i=length-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);;
	if(s==rev) {
		System.out.println("palindrome string");
	}
	else {
		System.out.println("Not palindrome");
	}
//	else
//	String s = "A man, a plan, a canal: panama";
//	String t = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
//	System.out.println(new StringBuilder(t).reverse().toString().equals(t));
//	
	
	
	
	
	
	
}
}
