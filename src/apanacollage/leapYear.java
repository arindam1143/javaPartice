package apanacollage;
import java.util.Scanner;
public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scobj=new Scanner(System.in);
		System.out.print("enter year: ");
		int year=scobj.nextInt();
		boolean x=(year%4==0);
		boolean y=(year%100 !=0);
		boolean z=(year%100==0) && (year%400==0);
		if(x && (y||z)) {
			System.out.println("entered is leapyear");
		}
		else {
			System.out.println("entered year is not leapyear");
		}
		

	}

}
