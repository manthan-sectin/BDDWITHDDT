package javaProgramiz;

public class LongestWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="I love javasdertgh programming";
		String[] words=s.split("\\s+");
		String longest=" ";
		for(String word:words) {
			if(word.length()>longest.length())
			{
				longest=word;
			}
		}
		System.out.println(longest);
		
		
		
		
		
	}

}
