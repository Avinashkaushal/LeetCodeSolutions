package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumTimeToCollectApples {

	public static void main(String[] args) {
		
		int n =7 ;
		int[][] edges = new int[][] {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
		List<Boolean> hasApple = new ArrayList<Boolean>();
		hasApple.add(false);
		hasApple.add(false);
		hasApple.add(true);
		hasApple.add(false);
		hasApple.add(true);
		hasApple.add(true);
		hasApple.add(false);
		
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
		List<Integer> placesOfApples = new ArrayList<Integer>();
		int p=0;
		for(Boolean b: hasApple) {
			if(b) {
				placesOfApples.add(p);
				p++;
			}else {
				p++;
			}
			
		}
		System.out.println(placesOfApples);
		for(int i =0; i< edges.length ;i++) {
			for(int j= 0;j< edges[i].length-1;j++) {
				if(map.containsKey(edges[i][j])) {
					ArrayList<Integer> current = map.get(edges[i][j]);
					current.add(edges[i][j+1]);
					map.put(edges[i][j], current);
				}else {
					map.put(edges[i][j], new ArrayList<Integer>(Arrays.asList(edges[i][j+1])));
				}
			}
		}	
		int k =0;
		int count =0;
		for(Map.Entry<Integer,ArrayList<Integer>> entry : map.entrySet()) {
			k = k+2;
			for(Integer a: placesOfApples) {
				if(entry.getValue().contains(a)) {
					count = count +k;
				}
			}
		}
		
		System.out.println(count);

	}

}
