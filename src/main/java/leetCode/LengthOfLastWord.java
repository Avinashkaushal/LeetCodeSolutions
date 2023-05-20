package leetCode;

public class LengthOfLastWord {
	
	public static void main(String...args) {
		
//		String s = "   fly me   to   the moon  ";
		String s = " a";
		System.out.println(s.lastIndexOf(" "));
		System.out.println(s.trim().length());
		s= s.trim();
		System.out.println((s.trim()).lastIndexOf(" ") +1);
		System.out.println(s.substring(((s.trim()).lastIndexOf(" ")) +1));
		System.out.println(s.substring(((s.trim()).lastIndexOf(" ")) +1).length());
      System.out.println((s.substring(((s.trim()).lastIndexOf(" ")) +1)).length());
      System.out.println((s.substring(((s.trim()).lastIndexOf(" ")) +1)).length());
	}

}
