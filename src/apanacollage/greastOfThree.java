package apanacollage;
import java.util.Scanner;
public class greastOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scobj=new Scanner(System.in);
		int num1=scobj.nextInt();
		int num2=scobj.nextInt();
		int num3=scobj.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.print(num1+" is the greaest");
		}
		else if(num2>num3) {
			System.out.print(num2+" is greaest");
		}
		else {
			System.out.print(num3+" is greaest");
		}
	}

}
