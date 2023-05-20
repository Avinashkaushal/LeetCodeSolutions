package leetCode;


public class RemoveDublicatesFromSortedArray {

	public static void main(String...args) {
		
//		int[] nums = new int[] {1,1,2};
		int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
		
		int current = 0,counter=0;



        for(int i = 0 ;i<nums.length-1;i++){
    		if(nums[i] != nums[i+1]) {
    			nums[current+1] = nums[i+1];
    			counter++;
    			current++;
    		}
        }
        
        System.out.println(counter+1);
      for(Integer a: nums) {  
    	  System.out.println(a);
      }

	}
	
//	public static int order(int[]a) {
//		int counter=1;
//		int pre=a[0];
//		boolean flag=false;
//		int max=1;
//		for(int i=1;i<a.length;i++) {
//			if(a[i]>pre) {
//				if(flag) {
//					a[counter]=a[i];
//				}
//				pre=a[i];
//				counter++;
//				max++;
//			} else {
//				flag=true;
//			}
//		}
//		return max;
//	}

}
