package Bit_Manipulation;

public class get_ith_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;//101
		int i=2;
		i=1<<i;
		if((n&i)==0) {
			System.out.println("ith ele is 0");
		}
		else {
			System.out.print("ith ele is 1");
		}
	}

}
