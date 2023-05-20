package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class MRTCATasks {

	public static void main(String[] args) {
		
		int[] tasks = new int[] {2,2,3,3,2,4,4,4,4,4};
		int count =0;

		Map<Integer,Integer> occurances= new HashMap<Integer,Integer>();
		for(Integer ch:tasks) {
			if(occurances.containsKey(ch)) {
				occurances.put(ch, occurances.get(ch)+1);
			}else {
				occurances.put(ch, 1);
			}
		}
		
		System.out.println(occurances);
		for (Map.Entry<Integer, Integer> entry : occurances.entrySet()) {
			Integer V= entry.getValue();
			if(V==1) {
				count = -1;
				break;
			}if(V%3 == 0 ) {
				count = count + (V/3);
			}else if (V%3 ==2) {
				count = count + (V/3) +1;				
			}else if (V%3 ==1) {
				count = count + (V/3) +(V%3);				
			}
			else if(V%2 ==0){
				count = count + (V/2);
			}else if(V%2 ==3) {
				count = count + (V/2) +1;
			}
			else {
				count = -1;
				break;
			}
		}
		System.out.println(count);
	}

}
