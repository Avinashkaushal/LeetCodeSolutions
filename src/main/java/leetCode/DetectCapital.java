package leetCode;

public class DetectCapital {
	
	public static void main(String...args) {
		
		String word = "Leetcode";
		Integer countUp = 0;
		
		for(int i = 0; i< word.length();i++) {
			
			Character ch = word.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				countUp = countUp+1;;
			}
		}
		if (countUp == 0 || countUp == word.length() ) {
			System.out.println(true);
		}else if(countUp == 1 && Character.isUpperCase(word.charAt(0))){
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		
	}

}
