package Bit_Manipulation;

public class Set_ithBit_Clear_ithBit {
	static int set_ithBit(int n,int pos) {
		int bitmask=1<<pos;
		
		return (n|bitmask);
	}
	static int clear_ithBit(int n,int pos) {
		int bitmask=~(1<<pos);
		
		return n&bitmask;
	}
	
	//clear last ith bit
	static int clearBit(int n,int num) {
		int bitmask=(~0<<num);
		return n&bitmask;
	}
	//clear bit in range
	static int clearBitinRange(int n,int i,int j) {
		int a=(~0<<j+1);
		int b=(1<<i)-1;
		int bitmask=a|b;
		return n&bitmask;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(set_ithBit(10,2));
		System.out.println(clear_ithBit(10,1));
		System.out.println(clearBit(15,2));
		System.out.println(clearBitinRange(10,2,4));

	}

}
