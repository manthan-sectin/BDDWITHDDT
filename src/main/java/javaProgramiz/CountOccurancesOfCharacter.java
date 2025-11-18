package javaProgramiz;

public class CountOccurancesOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="banana";
		char target='a';
		int count=0;
		for(char c:s.toCharArray())
		{
		if(c==target) {
			count++;
		}
		}
		System.out.println(count);
		
		
		
		
		
		
		
	}

}
