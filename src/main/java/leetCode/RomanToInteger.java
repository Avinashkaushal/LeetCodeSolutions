package leetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {

		
		Map <String,Integer>   mapper = new HashMap<String,Integer>();
		mapper.put("I", 1);
		mapper.put("V",5);
		mapper.put("X", 10);
		mapper.put("L",50);
		mapper.put("C", 100);
		mapper.put("D", 500);
		mapper.put("M", 1000);
		mapper.put("XL", 40);
		mapper.put("XC", 90);
		mapper.put("CD", 400);
		mapper.put("CM", 900);
		mapper.put("IV", 4);
		mapper.put("IX", 9);
		
		String s = "MCMXCIV";
		Integer sum = 0;
		char[] chr = s.toCharArray();
		
		for(int i =0;i<chr.length;i++) {
			if(chr[i] == 'C' && (i+1 != s.length())) {
				if(chr[i+1] =='D') {
					sum = sum + mapper.get("CD");
					i= i+1;
				}else if(chr[i+1] =='M') {
					sum = sum + mapper.get("CM");
					i= i+1;
				}else {
					sum = sum + mapper.get(String.valueOf(chr[i]));
				}
			}else if(chr[i] =='X'&& (i+1 != s.length())) {
				if(chr[i+1] =='L') {
					sum = sum + mapper.get("XL");
					i= i+1;
				}else if(chr[i+1] =='C') {
					sum = sum + mapper.get("XC");
					i= i+1;
				}else {
					sum = sum + mapper.get(String.valueOf(chr[i]));
				}
			}else if(chr[i] =='I' && (i+1 != s.length())){
				if(chr[i+1] =='V') {
					sum = sum + mapper.get("IV");
					i= i+1;
				}else if(chr[i+1] =='X') {
					sum = sum + mapper.get("IX");
					i= i+1;
				}else {
					sum = sum + mapper.get(String.valueOf(chr[i]));
				}
			}else {
				sum = sum + mapper.get(String.valueOf(chr[i]));
			}
		}
		
		System.out.println(sum);
		

	}

}
