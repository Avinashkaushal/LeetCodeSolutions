package leetCode;

public class SearchInsertPosition {

	public static void main(String[] args) {
		
		int[] nums = new int[] {1,2,3,4,5,10};
		int target= 2;
		int end =nums.length-1 ,start =0,mid =0;
		
		if(target <= nums[0]) {
			System.out.println(0);
		}
		if(target == nums[nums.length-1])
		{
			System.out.println(nums.length-1);
		}
		while(start <=end) {
			 mid = start + (end-start)/2;
			if(target == nums[mid]) {
				break;
			}else if(target > nums[mid]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		if(start < end)
		System.out.println(mid);
		else if(start > end)
		System.out.println(start);
		else {
			System.out.println(end);
		}

	}


}
