package OwnPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueEleemntUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);

	        Set<Integer> unique = new HashSet<>(list);

	        System.out.println(unique);
	}

}
