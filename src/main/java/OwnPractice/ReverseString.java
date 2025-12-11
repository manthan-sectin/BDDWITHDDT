package OwnPractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="My Java";
//		StringBuilder sb=new StringBuilder(str);
//		String reverse=sb.reverse().toString();
//		System.out.println(reverse);
		
		String s="My name is Java";
		String[] words=s.split(" ");
		StringBuilder sb=new StringBuilder();
		
		for(String word:words) {
			sb.append(new StringBuilder(word).reverse().toString()).append(" ");
			
		}
 		
		
		System.out.println(sb.toString().trim());
		
		 for (int i = words.length - 1; i >= 0; i--) {
	            sb.append(words[i]).append(" ");
	        }
		
		 System.out.println(sb.toString().trim());
		
		
	}

}
