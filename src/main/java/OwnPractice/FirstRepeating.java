package OwnPractice;

public class FirstRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="manthan";
for(int i=0;i<str.length();i++) {
	char c=str.charAt(i);
	boolean repeat=false;
	for(int j=0;j<i;j++) {
		if(str.charAt(j)==c) {
			repeat=true;
			
		}
	}
	if(repeat) {
		System.out.println("Duplicate char is " +c);
		
	}
}
		
		
		
		
		
		
		
		
		
		
	}

}
