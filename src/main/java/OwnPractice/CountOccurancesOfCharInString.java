package OwnPractice;

public class CountOccurancesOfCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Manthaaan";
		char target='h';
		int count =0;
		for(char c : str.toCharArray()) {
			if(c==target) {
				count++;
			}
			
		}
		System.out.println(count);
		
		
		
		
		
		
		
		
	}

}
