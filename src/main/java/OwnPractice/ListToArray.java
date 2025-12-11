package OwnPractice;

import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("A","B","C");

        String[] arr = list.toArray(new String[0]);

        System.out.println(Arrays.toString(arr));
    }
	}


