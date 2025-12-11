package OwnPractice;

import java.util.List;

import org.assertj.core.util.Arrays;

public class ConverStringToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="A,B,C";
		List<Object> list =Arrays.asList(str.split(","));
		System.out.println(list);
		
		
		
	}

}
