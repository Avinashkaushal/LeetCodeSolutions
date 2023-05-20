package leetCode;

public class GetLeastDistanceBtwTwoWords {

	public static void main(String[] args) {

		String s = "My name is avinash i am good guy";
		String s1 = "avinash";
		String s2 = "guy";

		String[] arr = s.split(" ");

		int current = 0, min = s.length();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(s1) || arr[i].equals(s2)) {
				if (current == 0) {
					current = i;
				} else {
					if (arr[current].equals(arr[i])) {
						current = i;
					} else {
						min = Math.min(min, (i - current));
					}
				}
			}

		}

		System.out.println(min);

	}

}
