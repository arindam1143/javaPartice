package Dynamic_Programming;

public class Climbing_stairs {
	// using recursion
	public static int countwayRecursion(int n) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		return countwayRecursion(n-1)+countwayRecursion(n-2);
	}
	//using memoization
	public static int countwayMemoization(int n,int[] dp) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		if(dp[n] !=0) {
			return dp[n];
		}
		return dp[n]=countwayMemoization(n-1,dp)+countwayMemoization(n-2,dp);
	}
	
	// using tabulation
	public static int countWay(int n) {
		int[] dp=new int[n+1];
		dp[0]=1;
		for(int i=1;i<=n;i++) {
			if(i==1) {
				dp[i]=dp[i-1];
			}else {
				dp[i]=dp[i-1]+dp[i-2];
			}
			
		}
		return dp[n];
	}
	
public static void main(String[] args) {
	System.out.println(countwayRecursion(5));// time complexity is O(2^N)
	int n=5;
	int[] dp=new int[n+1];
	System.out.println(countwayMemoization(5,dp));
	System.out.println(countWay(5));
}
}
