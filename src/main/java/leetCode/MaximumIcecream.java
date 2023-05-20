package leetCode;

import java.util.Arrays;

public class MaximumIcecream {
	
	public static void main(String[] args) {
		int coins = 241;
//		int[] costs = new int[] {1,6,3,1,2,5};
		int[] costs = new int[] {27,23,33,26,46,86,70,85,89,82,57,66,42,18,18,5,46,56,42,82,52,78,4,27,96,74,74,52,2,24,78,18,42,10,12,10,80,30,60,38,32,7,98,26,18,62,50,42,15,14,32,86,93,98,47,46,58,42,74,69,51,53,58,40,66,46,65,2,10,82,94,26,6,78,2,101,97,16,12,18,71,5,46,22,58,12,18,62,61,51,2,18,34,12,36,58,20,12,17,70};
		
		Arrays.sort(costs);
		int sum =0,i =0;
		for(i =0 ;i< costs.length;i++) {
			if(coins >= sum) {

				sum = sum+costs[i];
			}else {
				break;
			}
			
		}
		if(coins > sum) {
			System.out.println(i);
		}else {
			System.out.println(i-1);
		}
	}
}
//int count = 0;
//for(int i : costs){
//    if(coins<i){
//        continue;
//    }else{
//        if(coins-i >= 0){
//            coins = coins-i;
//            count++;
//        }else{
//            continue;
//        }                
//    }
//}