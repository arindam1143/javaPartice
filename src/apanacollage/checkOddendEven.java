package apanacollage;
import java.util.Scanner;
public class checkOddendEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scobj=new Scanner(System.in);
int enternum=scobj.nextInt();

if(enternum==1) {
	System.out.println("1 is not odd or even ");
	
   }
else if(enternum%2==0) {
	System.out.println(enternum+" is even");
}
else {
	System.out.println(enternum+" is odd");
}
}

}
