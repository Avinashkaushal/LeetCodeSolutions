package leetCode;

public class TwoSum {
	
	public static void main(String...args) {
		
		Integer[] nums = new Integer[]{3,2,4,5,1};
		Integer[] result = new Integer[2];
		Integer target = 6, sum =0;
		int in=0,jn=0;

		
		for(int i = 0; i< nums.length;i++) {
			sum = 0;
			for(int j = i+1;j< nums.length;j++) {
				sum = nums[i] + nums[j];
				if(sum == target) {
					in ++;
					
				}
			}
		}

		System.out.println(in);


		
	}

}
