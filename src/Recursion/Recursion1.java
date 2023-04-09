package Recursion;

public class Recursion1 {
	public static void PrintDec(int n) {
		if(n==1) {
			System.out.print(n+" ");
			return;
		}
		System.out.print(n+" ");
		PrintDec(n-1);
	}
	public static void PrintInc(int num) {
		if(num==1) {
			System.out.print(num+" ");
			return;
		}
		PrintInc(num-1);
		System.out.print(num+" ");
	}
	public static int Factorial(int i) {
		if(i==1 || i==0) {
			return 1;
		}
		return i*Factorial(i-1);
	}
	
	public static int SumOfN_Number(int n) {
		if(n==1 || n==0) {
			return n;
		}
		return (n+SumOfN_Number(n-1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintDec(5);
		System.out.println("\n-------------------------------------------");
		PrintInc(5);
		System.out.println("\n-------------------------------------------");
		System.out.print(Factorial(5));
		System.out.println("\n-------------------------------------------");
	    System.out.print(SumOfN_Number(5));
		System.out.println("\n-------------------------------------------");
		System.out.println("\n-------------------------------------------");
		System.out.println("\n-------------------------------------------");
		System.out.println("\n-------------------------------------------");
		System.out.println("\n-------------------------------------------");
	}

}
