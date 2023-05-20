package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses {

	public static void main (String...args) {
		String s = "(){}}{";
		String openBraces ="{([";
		String closeBraces ="]})";
		int notbalanced =0;

		Map<Character, Character> balance = new HashMap<>();
		balance.put('}', '{');
		balance.put(')', '(');
		balance.put(']', '[');

		if (null == s || ((s.length() % 2) != 0) || closeBraces.contains(String.valueOf(s.charAt(0)))) {
			System.out.println("Notvalid");
		} else {
			Stack<Character> stack = new Stack<>();
			for(char c : s.toCharArray()) {
				if(openBraces.contains(String.valueOf(c))) {
					stack.push(c);

				}else if(closeBraces.contains(String.valueOf(c))) {
					if(stack.size() >0) {
						char b = stack.pop();
						if(b == balance.get(c)) {
							continue;
						}else {
							notbalanced = 1;
							break;
						}
					}else {
						notbalanced = 1;
						break;
					}
					
				}
			}

			if(stack.empty() && notbalanced != 1) {
				System.out.println("valid");
			}else {
				System.out.println("Notvalid");
			}

		}
	}

}
