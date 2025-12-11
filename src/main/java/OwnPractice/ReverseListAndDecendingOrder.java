package OwnPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReverseListAndDecendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> list=Arrays.asList(1,2,4,2,3,6,4,4);
	////UNIQUE
	Set<Integer> unique=new HashSet<>(list);
	System.out.println(unique);
	

	////Reverse order
	list.sort(Collections.reverseOrder());
	System.out.println(list);
	
	//ReverseLIST
	//Collections.reverse(list);
	//System.out.println(list);
	}

}
