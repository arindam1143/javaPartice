package apanacollage;

public class binaryTo_decemal {
	public static int BinToDec(int num) {
		int decemal=0;
		int power=0;
		while(num >0) {
			
			int rem=num%10;
			decemal=decemal+(int)(rem*Math.pow(2,power));
			power++;
			num=num/10;
		}
		
		return decemal;
	}
	public static int DecToBin(int num) {
		int pow=0;
		int binnum=0;
		while(num>0) {
			int rem=num%2;
			binnum=binnum+(rem*(int)Math.pow(10,pow));
			pow++;
			num=num/2;
		}
		return binnum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int res=BinToDec(110);
		//System.out.print(res);
		System.out.println();
		System.out.print(DecToBin(4));

	}

}
