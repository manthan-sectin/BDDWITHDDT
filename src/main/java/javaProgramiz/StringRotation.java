package javaProgramiz;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str1="abcd";
	String str2="cdab";
	if(str1.length()==str2.length() && (str1+str2).contains(str2)) {
		System.out.println(str2 + " is roation of " +str1);
	}
		
	else {
		System.out.println(str2 + " is not roation of " +str1);
	}
		
		
		
		
		
		
		
	}

}
