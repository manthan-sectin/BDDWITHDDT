package OwnPractice;

import java.util.HashMap;

public class CountOccurancesOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="this is a hackathon and this hackathon is fun";
int count =1;
for(int i=0;i<str.length();i++) {
	if(str.charAt(i)==' ' &&str.charAt(i+1)!=' ') {
		count++;
	}
	
	
	
}System.out.println(count);

		 String s = "this is a hackathon and this hackathon is fun";
	        String[] words = s.split(" ");
	        System.out.println(words);

	        HashMap<String, Integer> map = new HashMap<>();
	      for (String w : words )
	       
	            map.put(w, map.getOrDefault(w, 0) + 1);

	        System.out.println(map);
	}

}
