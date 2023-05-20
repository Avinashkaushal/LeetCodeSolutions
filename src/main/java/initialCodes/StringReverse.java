package initialCodes;

import java.util.Comparator;
import java.util.stream.Stream;

public class StringReverse {

	public static void main(String[] args) {
		
		String str ="this is good";
		String s="";
		StringBuffer n=new StringBuffer();
		
		char c[]=str.toCharArray();
		n.append(str);
		n.reverse();
		
		for(int i=str.length()-1;i>=0;i--) {
			s+=c[i];
		}
		//s=rev.toString();
		System.out.println(Stream.of(str).sorted(Comparator.reverseOrder()));
		System.out.println("rev="+n);
		System.out.println("rev="+s);

	}

}
