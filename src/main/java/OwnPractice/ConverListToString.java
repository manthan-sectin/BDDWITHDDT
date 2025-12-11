package OwnPractice;

import java.util.Arrays;
import java.util.List;

public class ConverListToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	//	List<String> list=Arrays.asList("A","B","C");
		List<String> list=Arrays.asList("A","B","C"); 
		 String joined = String.join(",", list);

	        System.out.println(joined);
	}

}
