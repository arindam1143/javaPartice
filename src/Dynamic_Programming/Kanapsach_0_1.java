package Dynamic_Programming;
import java.util.Arrays;
public class Kanapsach_0_1 {
	//using recursion
	public static int kanapsach(int[] val,int wt[],int w,int n ) {
		if(n==0|| w==0) {
			return 0;
		}
		if(wt[n-1]<=w) {
			int ans1=val[n-1]+kanapsach(val,wt,w-wt[n-1],n-1);
			int ans2=kanapsach(val,wt,w,n-1);
			return Math.max(ans1, ans2);
		}
		else {
			return kanapsach(val,wt,w,n-1);
		}
	}
	public static int kanapsacMemozition(int[] val,int[] wt,int w,int n,int[][] dp) {
		if(n==0|| w==0) {
			return 0;
		}
		if(dp[n][w] !=-1) {
			return dp[n][w];
		}
		if(wt[n-1]<=w) {
			int ans1=val[n-1]+kanapsacMemozition(val,wt,w-wt[n-1],n-1,dp);
			int ans2=kanapsacMemozition(val,wt,w,n-1,dp);
			dp[n][w]= Math.max(ans1, ans2);
			return dp[n][w];
		}
		else {
			dp[n][w]= kanapsacMemozition(val,wt,w,n-1,dp);
			return dp[n][w];
			
		}
	}
	//tabulaction 
	static int knapSack(int w, int wt[], int val[], int n) 
    { 
         // your code here
         n=val.length;
        int[][] dp=new int[n+1][w+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                int v=val[i-1];
                int we=wt[i-1];
                if(we<=j){
                    int incp=v+dp[i-1][j-we];
                    int exp=dp[i-1][j];
                    dp[i][j]=Math.max(incp,exp);
                }
                 else{
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
		//System.out.println(kanapsach(val,wt,w,val.length));
		int[][] dp=new int[wt.length+1][w+1];
		for(int i=0;i<wt.length+1;i++) {
			for(int j=0;j<w+1;j++) {
				dp[i][j]=-1;
			}
		}
		System.out.println(kanapsacMemozition(val,wt,w,val.length,dp));
		System.out.println(knapSack( w,  wt,  val, val.length));
		
	}

}
