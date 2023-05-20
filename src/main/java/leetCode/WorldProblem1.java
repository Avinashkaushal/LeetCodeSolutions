package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class WorldProblem1 {
	public static void main (String...args) {
		
	String pattern = "abc";
	String str = "b c a"	;
	
	String[] words = str.split(" ");
	
    if (words.length != pattern.length()) {
        System.out.println(false);
    }
	
	Map<String,Character> wordsToChar = new HashMap<>();
	Map<Character,String> charToWords = new HashMap<>();
	
	for(int i= 0; i<pattern.length();i++) {
		Character ch = pattern.charAt(i);
		String word = words[i]; 
		
		if(!charToWords.containsKey(ch)) {
			charToWords.put(ch, word);
		}
		
		if(!wordsToChar.containsKey(word)) {
			wordsToChar.put(word, ch);
		}
		
		if(!charToWords.get(ch).equals(word) || !wordsToChar.get(word).equals(ch)) {
			System.out.println(false);
		}
	}
	System.out.println(true);
	}
	
}
	
	

//class Solution {
//    public boolean wordPattern(String pattern, String s) {
//       String[] str = s.split(" ") ;
//       	
//	
//	List<String> disStr = Stream.of(str).distinct().toList();
//	List<Character> disChar = pattern.chars()
//                                .mapToObj(c-> (char) c)
//                                .distinct()     
//                                .toList();
//	List<String> list = new ArrayList<String>(disStr);
//    for(char c:disChar) {
//		for(String st:list) {
//			s= s.replace(st,String.valueOf(c));
//			Iterator<String> itr = list.iterator();			 
//	        while (itr.hasNext()) {
//	            String t = itr.next();
//	            if (t.equals(st)) {
//	                itr.remove();;
//	            }
//	        }		
//			break;	
//		}		
//	}
//
//    String finalStr= s.replaceAll("\\s", "");
//    if(finalStr.equals(pattern)) {
//        return true;
//    }else{
//        return false;
//    }
//       
//    }
//}
