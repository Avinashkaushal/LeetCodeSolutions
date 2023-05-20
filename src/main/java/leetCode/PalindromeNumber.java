package leetCode;

public class PalindromeNumber {
	
	public static void main(String...strings) {
		
		int x = 111221111;
		String num = String.valueOf(x);
//		char[] charArr = num.toCharArray();
//		int mid = 0,i = 0,j = 0;
//		
//		if(charArr.length % 2> 0) {
//			mid = charArr.length/2+1;
//			i = mid-2;
//			j= mid;
//		}else {
//			mid = charArr.length/2;
//			i = mid-1;
//			j= mid;
//		}
//		System.out.println(i +" " + mid +" " + j);
//		
//		while(i > 0 || j < charArr.length) {
//			if(charArr[i] == charArr[j]) {
//				i--;
//				j++;
//				System.out.println(i +" " + mid +" " + j);
//			}else {
//				System.out.println("Not a palindrome");
//				break;
//			}
//			
//		}
//		
//		System.out.println("Palindrome");
		String reverse = null;
		for(int j = num.length()-1;j >=0;j--) {
			if(null==reverse) {
			reverse = String.valueOf(num.charAt(j));
			}
			else {
				reverse = reverse + num.charAt(j);
			}
		}
		if(num.equals(reverse))
		System.out.println("palindrome");		
				
	}

}

