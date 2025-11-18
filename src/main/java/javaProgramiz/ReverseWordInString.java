package javaProgramiz;

import java.util.Collections;
import java.util.List;

import org.assertj.core.util.Arrays;

public class ReverseWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String st="I love java";
//		for(String w:st.split("\\s+")){
//			 System.out.println(new StringBuilder(w).reverse()+" ");   
//		}
//String s = "I love Java programming";
//        
//        // Split into words, reverse order, and join
//        String[] words = s.split("\\s+");
//        StringBuilder sb = new StringBuilder();
//        
//        for (int i = words.length - 1; i >= 0; i--) {
//            sb.append(words[i]).append(" ");
//        }
//        
//        System.out.println(sb.toString().trim());
//		
		String str="I love java prgramming";
		String[] words=str.split(" ")
;
		String result=" ";
		
		for(int i=words.length-1;i>=0;i--) {
			String word=words[i];
			String rev=" ";
			for(int j=word.length()-1;j>=0;j--) {
				rev=rev+word.charAt(j);
			}
			result=result+rev+" ";
			
		}
		System.out.println(result.trim());
		
		
		
		
		
	}

}
