package javaProgramiz;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharFrequency {
public static void main(String[] args) {
	 String s = "aabbbcccc";
     Map<Character, Integer> freq = new LinkedHashMap<>();

     for (char c : s.toCharArray()) {
         freq.put(c, freq.getOrDefault(c, 0) + 1);
     }

    System.out.println(freq);
  //   freq.forEach((ch, count) -> System.out.println(ch + " " + count + " times"));
}
}
