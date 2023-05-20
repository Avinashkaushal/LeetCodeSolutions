package leetCode;

public class CheckPalindrome {
	
	public static void main(String...args) {
		 
	//	String s = "A man, a plan, a canal: Panama";
	//	String s = "race a car";
	//	String s = "a.";
		
		String s= "0P";
		
		
		char[] chrArr = s.toCharArray();
		char[] removeChrArr = new char[s.length()];
		int k= 0,i=0,flag=0;
		for(char c : chrArr) {
			if(Character.isLetterOrDigit(c)) {				
			removeChrArr[k] = c;
			k++;
			}else {
				flag =1;
			}
		}
		if(k != s.length()-1||flag == 1 ) {
			k--;	
		}

		while(k>i) {
			if(Character.toLowerCase(removeChrArr[k]) == Character.toLowerCase(removeChrArr[i])
					|| removeChrArr[k] == removeChrArr[i]) {
				i++;
				k--;
			}else {
				System.out.println(false);
				break;
			}
		}
		
		System.out.println(true);
	}

}
