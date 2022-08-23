package apanacollage;
import java.util.Scanner;
public class greaterOftwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scobj=new Scanner(System.in);
		int num1=scobj.nextInt();
		int num2=scobj.nextInt();
		if(num1==num2) {
			System.out.print("two number are equal");
		}
      if(num1>num2) {
    	  System.out.print(num1+" is grreater than "+num2);
      }
      else {
    	  System.out.print(num2+" is grreater than "+num1);
      }
	}

}
