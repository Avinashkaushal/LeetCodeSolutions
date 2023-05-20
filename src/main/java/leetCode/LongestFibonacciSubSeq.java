package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestFibonacciSubSeq {

	public static void main(String[] args) {
		 
		int[] arr = new int[] {1,2,3,4,5,6,7,8};
		
		List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		List<List<Integer>> subSeq = new ArrayList<List<Integer>>();
		
		for(int i= 2;i<arr.length;i++) {
			List<Integer> list = new ArrayList<Integer>();			
		}
		
		

	}

}
