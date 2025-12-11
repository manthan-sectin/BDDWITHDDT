package OwnPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map=new HashMap<>();
		map.put(1,"Sam");
		map.put(3, "Jam");
		map.put(5, "Ram");
		
		Map<Integer, String> sorted=new TreeMap<>(map);
		System.out.println(sorted);
		
	
	}

}
