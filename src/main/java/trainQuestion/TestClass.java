package trainQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestClass {

	public static void main(String[] args) {
		List<String> lis=Arrays.asList("a","b");
		Map<String, Integer> m = new HashMap<>();
		String s="";
		int count=1;
		for(String val:lis) {
			if(m.containsKey(val)) {
				s+=m.get(val).toString();
			} else {
				m.put(val, count);
				s+=count;
				count++;
			}
		}
		String pat="";
		m = new HashMap<>();
		count=1;
		char[] pattern = "abc".toCharArray();
		for(int i=0;i<pattern.length;i++) {
			String key=""+pattern[i];
			if(m.containsKey(key)) {
				pat+=m.get(key).toString();
			} else {
				m.put(key, count);
				pat+=count;
				count++;
			}
		}
		System.out.println(s);
		System.out.println(pat);
	}

}
