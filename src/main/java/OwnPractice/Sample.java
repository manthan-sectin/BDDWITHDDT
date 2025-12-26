package OwnPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="manthan is mantha my mantha";
		String[] st=str.split("\\s+");
		StringBuilder sb=new StringBuilder();
		HashSet<String> set=new LinkedHashSet<>();
		HashSet<String> dup=new LinkedHashSet<>();
		for(String s : st) {
			if(!set.add(s)) {
				dup.add(s);
			}
		}
		for(String d : dup) {
			sb.append(d);
		}
		
		System.out.println(sb.toString());
		
	}
}