package apanacollage;
import java.util.Scanner;
public class reversNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scobj=new Scanner(System.in);
		int num=scobj.nextInt();
		int reversNum=0;
		while(num !=0) {
			int lastDigit=num%10;
			reversNum=(reversNum*10)+lastDigit;
			num=num/10;
		}
		System.out.print(reversNum);

	}

}
