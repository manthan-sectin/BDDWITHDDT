package javaProgramiz;

public class CountWordsAndLength {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String s = "Hello world this is Java";
//
//		// Split string by spaces (\\s+) to handle multiple spaces
//		String[] words = s.trim().split("\\s+");
//
//		System.out.println("total words : " + words.length);
//
//		for (String word : words) {
//			System.out.println(word + "--> " + word.length());
//		}
		String str="My name is Manthan";
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println("No of words: " +count);
}

}
