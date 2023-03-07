package Bit_Manipulation;

public class FastExponent {
	static int fastExponent(int a,int n) {//a to the power n
		int ans=1;
		while(n>0) {
			if((n&1)==1) {
				ans=ans*a;
			}
			a=a*a;
			n=n>>1;
		}
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fastExponent(5,3));

	}

}
