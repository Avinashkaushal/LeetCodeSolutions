package leetCode;

public class TribionnaciSeries {
	
	public static void main(String...strings) {
		
		int n = 25;
		int[] results = new int[n+1];
		results[0] = 0;
		results[1] = 1;
		results[2] = 1;
		for(int i= 3;i<=n;i++) {
			results[i]= results[i-1]+ results[i-2] + results[i-3];
		}
		
		System.out.println(results[results.length-1]);
	}
	

}
