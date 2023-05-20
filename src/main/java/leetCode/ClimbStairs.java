package leetCode;

import java.util.ArrayList;
import java.util.List;

public class ClimbStairs {

	public static void main(String[] args) {
		//fabonacci series is the soln
		int n = 6;
		List<Integer> results = new ArrayList<Integer>();
	    int dp[]=new int [n+1];
        dp[0]=1;
        results.add(1);
        dp[1]=1;
        results.add(1);
        for(int i=2;i<=n;i++) {
            dp[i]=dp[i-1] + dp[i-2];
            results.add(dp[i]);
        }
		
		System.out.println(results);
	}
}
