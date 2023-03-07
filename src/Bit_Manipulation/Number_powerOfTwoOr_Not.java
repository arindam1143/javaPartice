package Bit_Manipulation;

public class Number_powerOfTwoOr_Not {
	static boolean PowerOfTwo(int n) {
		return (n&(n-1))==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PowerOfTwo(8));
		

	}

}
