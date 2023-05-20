package leetCode;


public class MergeSortedArrays {

	public static void main(String[] args) {
		
		int[] nums1 = new int[] {1,2,6,7,0,0,0,0};
		int[] nums2 = new int[] {1,2,6,7};
		int m = 3,n = 3;
		 int i=m+n-1; 
	      int p1 = m-1 , p2 = n-1 ;
	        while(p2 >=0 ){
	            if(p1 >=0 && nums1[p1] > nums2[p2]){
	                nums1[i--] = nums1[p1--];
	            } 
	            else{
	                nums1[i--] = nums2[p2--];
	            }
	        }
	        
	        
		
	}
	

	

}
