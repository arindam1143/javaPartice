package Bit_Manipulation;

public class check_Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a=1115000;
		long ans=a & 1;
		if(ans==1) {
			System.out.println("the num is odd");
		}
		else
			{
				System.out.println("the nuber is even");
			}
	}

}
