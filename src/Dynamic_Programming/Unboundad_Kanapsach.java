package Dynamic_Programming;

public class Unboundad_Kanapsach {
	public static int unboudad(int[] val,int[] wt,int w,int n) {
		int[][] dp=new int[n+1][w+1];
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<w+1;j++) {
				if(wt[i-1]<=j) {
					int v=val[i-1];
					int we=wt[i-1];
					int incp=v+dp[i][j-we];
					int exp=dp[i-1][j];
					dp[i][j]=Math.max(incp, exp);
				}
				else {
					dp[i][j]=dp[i-1][j];
				}
			}
			
		}
		return dp[n][w];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[]= {15,14,10,45,30};
		int wt[]= {2,5,1,3,4};
		int w=7;
		System.out.println(unboudad(val,wt,w,val.length));

	}

}
