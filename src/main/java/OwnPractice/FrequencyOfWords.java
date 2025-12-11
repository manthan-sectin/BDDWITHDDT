package OwnPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "My name is java and java is core lang";
		String[] words = str.split(" ");

		Map<String, Integer> freq=new HashMap<>();
		for(String word:words) {
			freq.put(word,freq.getOrDefault(word, 0)+1);
		}
		System.out.println(freq);
		
		
		//////////////////////////////
		///
		///
		List<Integer> list = Arrays.asList(1,2,2,3,3,3);

        Map<Integer,Integer> map = new HashMap<>();

        for(Integer i : list)
            map.put(i, map.getOrDefault(i,0)+1);

        System.out.println(map);
		
		
	}

}
