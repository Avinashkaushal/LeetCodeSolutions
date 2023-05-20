package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
@FunctionalInterface
interface Sum {
	public int sumofNumber(int[] nums);
}
public class CheckFunctionalInterface {

	public static void main(String...args) {
		
		Sum numbersSum = (nums) -> Arrays.stream(nums).reduce(5, (total,n)->total+n);
		int arr[]=new int[]{5,6,7,8,9,1,2,3,4};
		System.out.print(numbersSum.sumofNumber(arr));
		String s="abcabcabd";
		
		System.out.println(s.chars().mapToObj(n->(char)n).collect(Collectors.groupingBy(n->n,Collectors.counting())));
		System.out.println(s.chars().mapToObj(n->(char)n).collect(Collectors.toMap(n->n,n->1,(pre,curr)->pre+1)));
			
	}
}




