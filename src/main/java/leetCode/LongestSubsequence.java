package leetCode;

public class LongestSubsequence {
	
	 int lcs(char[] X, char[] Y, int m, int n)
	    {
	        if (m == 0 || n == 0)
	            return 0;
	        if (X[m - 1] == Y[n - 1])
	            return 1 + lcs(X, Y, m - 1, n - 1);
	        else
	            return max(lcs(X, Y, m, n - 1), lcs(X, Y, m - 1, n));
	    }
	 
	    int max(int a, int b)
	    {
	        return (a > b) ? a : b;
	    }

	public static void main(String[] args) {
		
		LongestSubsequence lcs = new LongestSubsequence();
		String s1 = "AGGTAB",s2 ="GXTXAYB";
		  char[] X = s1.toCharArray();
	        char[] Y = s2.toCharArray();
		int m = s1.length();
		int n = s2.length();
		System.out.println(lcs.lcs(X, Y, m, n));

	}

}
