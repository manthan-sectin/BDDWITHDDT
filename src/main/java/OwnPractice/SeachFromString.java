package OwnPractice;

public class SeachFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []str= {"man","than","sam","ram"}
		;
		String target="tan";
		boolean found=false;
		
		for(String s:str) {
			if(s.equals(target)) {
				found=true;
				break;
			}
		}
		
		if(found) {
			System.out.println(target  + "   found");
		}
		
		else  {
			System.out.println(target + " not found");
		}
		
		
		
		
		
	}

}
