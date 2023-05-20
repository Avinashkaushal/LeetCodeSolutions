package leetCode;

import java.util.HashSet;

public class Subsequence {

	public static void main(String[] args) {
		
		String s1 = "abcd";
		
		char[] chs = s1.toCharArray();
		
		HashSet<String> subSeq = new HashSet<String>();
		
		for(int i =0; i<chs.length;i++) {
			subSeq.add(String.valueOf(chs[i]));
				String sTemp = new String();
				sTemp = String.valueOf(chs[i]);
				subSeq.add(sTemp);
			for(int j = i+1; j<chs.length;j++) {
				sTemp = sTemp.concat(String.valueOf(chs[j]));
				subSeq.add(sTemp);				
			}
		}
		
		System.out.println(subSeq);
	}

}
