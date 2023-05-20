package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigitPlusOne {

	public static void main(String[] args) {
		
		int[] digits = new int[] {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
		int carry = 1;
		List<Integer> result = new ArrayList<Integer>();

		for(int i= digits.length-1;i>=0;i--) {

			if(((digits[i] + carry)/10) == 1) {
				result.add(0);
				carry = 1;
			}else if(carry == 1){
				result.add(digits[i]+1);
				carry = 0;
			}else {
				result.add(digits[i]);
				carry = 0;
			}					
		}
		if(carry == 1) {
			result.add(carry);
		}
		Collections.reverse(result);

		result.stream()
                .mapToInt(Integer::intValue)
                .toArray();

		
	

	}

}
