package Dynamic_Programming;

public class Fibonachi {
	public static int FindNthFibonachi(int n,int[] dp) {
		if(n==0 || n==1) {
			return n;
		}
		if(dp[n] !=0) {
			return dp[n];
		}
		
		dp[n]=FindNthFibonachi(n-1,dp)+FindNthFibonachi(n-2,dp);
		return dp[n];
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int[] dp=new int[n+1];
		System.out.println(FindNthFibonachi(n,dp));
	}

}
