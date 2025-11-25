package OwnPractice;

public class LongestWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="My name ismanthan";
		String[] words=s.split("\\s+");
		String longest=" ";
		for(String word:words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
		}
		System.out.println(longest);
		
		
		
		
	}

}
