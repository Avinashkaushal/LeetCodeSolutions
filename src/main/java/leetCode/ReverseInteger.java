package leetCode;

public class ReverseInteger {

	public static void main(String...args) {
//		int x = 12312;
//		int x = 102;
		int x = 90100;
		String s = null;
		
		if(x==0) {
			System.out.println(0);
		}else {
			s = String.valueOf(x);
		}

		String sub = null;
		char[] sCh =null;
		char[] result = new char[s.length()];
		int j= 0;
		String finalResult;

		
		if(s.charAt(0) == '-') {
			sub = s.substring(1);
			sCh = sub.toCharArray();
		}else {
			sCh = s.toCharArray();
		}
		int flag = sCh.length-1;
		
		if(sCh[flag] == 0 ){
			while(sCh[flag]==0) {
				sCh[flag] = ' ';
				flag--;
			}
		}
		
		for(int i = sCh.length-1;i>=0;i--) {
			if(sCh[i] == '0' && flag == 1) {
				flag=0;
			}else if (sCh[i] != 0) { 
					result[j] = sCh[i];
					j++;
			}
		}
		if(s.charAt(0) == '-') {
			finalResult = s.charAt(0) + String.valueOf(result);
		}else {
			finalResult= String.valueOf(result);
		}
		try {
			System.out.println(Integer.parseInt(finalResult.trim()));	
		}catch (NumberFormatException e) {
			System.out.println(0);
		}
		
		
	}
}
