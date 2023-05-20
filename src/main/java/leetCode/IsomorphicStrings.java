package leetCode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public static void main(String[] args) {

		String s= "add",t="egg";
		
		if(s.length() != t.length()) {
			System.out.println(false);
		}
		
		Map<Character, HashMap<Character,Integer>> map = new HashMap<Character,HashMap<Character,Integer>>();
		
		for(int i =0; i<s.length();i++) {
			if(map.containsValue(t.charAt(i))) {
				
			}
		}

	}

}
