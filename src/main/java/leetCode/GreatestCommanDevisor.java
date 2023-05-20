package leetCode;

public class GreatestCommanDevisor {

	public static void main(String[] args) {
		
		String s1 = "LEET", s2 = "CODE",s3= null; 

		
		if(s2.length()>s1.length()) {
			s3 = s1;
			s1 = s2;
			s2 = s3;
			s3 = s1; 
		}
		char[] chs = s2.toCharArray();
		s3 = "";
		int i =0;
		while(s3.length() != s2.length()) {
			s3 = s3.concat(String.valueOf(chs[i]));
			String temp = s1;
			while(temp.startsWith(s3)) {
				temp = temp.substring(s3.length());
				if(temp == "") {
					break;
				}				
			}
			if(temp == "") {
				System.out.println(s3);
				break;
			}
			i++;
		}
		
		System.out.println("");
		
	
	}

}
