package Recursion;

public class NumberPrintDrecreaingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printReverse(10);
	}
	static void printReverse(int n) {
		if(n==1) {
			System.out.println(1);
			return;
		}
		System.out.println(n);
		printReverse(n-1);
	}

}
