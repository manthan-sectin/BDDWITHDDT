package javaProgramiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaSentenceReverse {

	public static void main(String[] args) {
		
		String str = "interview I have on tomorrow";

        // Split by one or more spaces
        String[] parts = str.trim().split("\\s+");

        // Reverse the list
        List<String> list = Arrays.asList(parts);
        Collections.reverse(list);

        // Join back into a string
        String result = String.join(" ", list);

        System.out.println(result);
		
		
		
	}
}
