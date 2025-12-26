package OwnPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
List <String> list = Arrays.asList("man","than","man");
HashSet<String> set=new LinkedHashSet<>(list);
System.out.println(set);
		
		
	}

}
