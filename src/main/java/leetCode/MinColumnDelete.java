package leetCode;

public class MinColumnDelete {

	public static void main(String[] args) {
		
//	String[] strs = new String[] {"xyz","wvu","tsr"};
//	String[] strs = new String[] {"abc","def","ghi"};
//  String[] strs = new String[] {"rrjk","furt","guzm"};
  String[] strs = new String[] {"aihdtcw","hqlcusg","ptxfoxq"};
//	String[] strs = new String[] {"a","b","c","d"};		
		int count = 0;


	for(int i= 0;i < strs[0].length();i++) {
		int j= 0;

		
		while(j < strs.length-1) {
			if(strs[j].charAt(i)<=strs[j+1].charAt(i)) { 
			j++;
			}else {
				count++;
				break;
			}
		}
	}
	System.out.println(count);
		

	}

}

//int count = 0;
//
//System.out.println(strs.length);
//System.out.println(strs[0].length());
//
//for(int i= 0;i < strs[0].length();i++) {
//int j= 0;
//System.out.println("Character to check at location i = "+ i);
//
//while(j < strs.length-1) {
//	if(strs[j].charAt(i)<=strs[j+1].charAt(i)) { 
//		
//		System.out.println("word to check " +strs[j] +" at locatio j = " +j +" check with word " +strs[j+1]);
//		System.out.println("Chaecking character "+ strs[j].charAt(i) + " checking with character "+strs[j+1].charAt(i));
//	j++;
//	}else {
//		count++;
//		break;
//	}
//}
//}
