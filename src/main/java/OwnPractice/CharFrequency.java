package OwnPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str="qqsdeddd";
//		Map<Character, Integer> freq=new LinkedHashMap<>();
//		
//		for(char c: str.toCharArray())
//				{
//			freq.put(c, freq.getOrDefault(c, 0)+1);
//			
//				}
//		System.out.println(freq);

		 String str="aabbbcccc";
	        Map<Character,Integer> freq=new LinkedHashMap<>();
	        for(Character c:str.toCharArray()){
	            freq.put(c,freq.getOrDefault(c,0)+1);
	          //  freq.put(c, freq.getOrDefault(c, 0)+1);
	            
	        }
	        
	        System.out.println(freq);
	        		
		
		
		
		
		
		
		
	}

}
