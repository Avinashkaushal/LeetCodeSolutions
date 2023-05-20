package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ArrowsToBurstBallons {

	public static void main(String[] args) {

//		int[][] points = new int[][] { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 }};
//		int[][] points = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7,8 }};
//		int[][] points = new int[][] { { 1, 2 }, { 2, 3 }, { 3,4 }, {4,5 }};
//		int[][] points = new int[][] { { 1, 2 }, { 4, 5 }, { 1, 5 }};
//		int[][] points = new int[][] { { 3, 9 }, { 7, 12 }, { 3, 8 }, { 6, 8 },{ 9,10 },{ 2,9 },{ 0,9 },{3,9 },{ 0,6 },{2,8}};
//		int[][] points = new int[][] { { 2,3}, { 2,3}};
//		int[][] points = new int[][] { { 9,12 }, { 1,10 }, { 4,11 }, { 8,12 },{ 3,9 },{ 6,9},{6,7}};
//		int[][] points = new int[][] { { 3,9 }, { 7,12 }, { 3,8 }, { 6,8 },{9,10},{ 2,9},{0,9},{3,9},{2,8},{0,6}};
		int[][] points = new int[][] { { 0,9 }, { 1,8 }, { 7,8 }, {1,6 },{9,16},{ 7,13},{7,10},{6,11},{6,9},{9,13}};


		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		int count = 1,max=0,min =0;
		ArrayList<Integer> getValues = null;
		

		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length-1; j++) {
				if (map.containsKey(points[i][j])) {		
					getValues = map.get(points[i][j]);
					if(!getValues.contains(points[i][j+1]))
						getValues.add(points[i][j+1]);
					map.put(points[i][j],getValues );
					
				} else {
					map.put(points[i][j], new ArrayList<Integer>(Arrays.asList(points[i][j+1])));
				}
			}
		}
		System.out.println(map);
		max = Collections.max(map.get(map.firstKey()));

		for (Map.Entry<Integer,ArrayList<Integer>> entry : map.entrySet()) {
			if(entry.getKey() <= max ) {
				if(Collections.min(entry.getValue())< max){
					max= Collections.min(entry.getValue());				
				}
				continue;
			}else {
				max= Collections.min(entry.getValue());
				count++;
			}
		}
//		
		System.out.println(count);
		
	}

}
