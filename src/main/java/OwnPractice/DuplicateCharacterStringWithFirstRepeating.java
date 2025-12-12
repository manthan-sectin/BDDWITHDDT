package OwnPractice;

public class DuplicateCharacterStringWithFirstRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="manthanm";
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
		break;
		
	}
}
		
		
		
		
		
		
		
		
		
		
	}

}
