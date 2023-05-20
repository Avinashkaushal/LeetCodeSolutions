package leetCode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LongestPrefix {
	
	public static void main (String...args) {
	String[] strs = new String[] {"ab","a"};
	String prefix = "";
	int n=0;
//	int lengthofShortestStr = Arrays.asList(strs)
//            .stream()
//            .collect(Collectors.summarizingInt(String::length))
//            .getMin();
	for(int i= 0;i < strs[0].length();i++) {
		int j= 0;
		while(j < strs.length-1) {
			System.out.println(strs[j+1].charAt(i));
			if(strs[j].charAt(i) ==strs[j+1].charAt(i)) { 
			j++;
			}else {
				n=1;
				break;
			}
		}
		if("" != prefix) {
			if(n==1) {
				break;
			}
			prefix = prefix.concat(String.valueOf(strs[j].charAt(i)));
			
		}else {
			if(n==1) {
				break;
			}
			prefix = String.valueOf(strs[j].charAt(i));
		}
	}
	
	System.out.println(prefix);
	
	
	
	
	}

}
