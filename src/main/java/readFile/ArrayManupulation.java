package readFile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayManupulation {

	public static void main(String[] args) {
		Integer[] a1 = new Integer[]{10,3,8,5,6}; 
		Integer[] a2 = new Integer[]{12,7,9,17,31}; 
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		List<Integer> arrayList = Stream.of(a1)
									.filter(a -> a%2 == 0)
									.map(a -> a* 5)
									.sorted((i1,i2) -> i2.compareTo(i1))									
									.collect(Collectors.toList());
		
		System.out.println(arrayList);
		
		
									

	}

	



}
