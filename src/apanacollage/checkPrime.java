package apanacollage;
import java.util.*;
public class checkPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scobj=new Scanner(System.in);
		int num=scobj.nextInt();
		boolean isprime=true;
		if(num==2) {
			System.out.println(num+" is prime");
			
		}
		else {
			for(int i=2;i<Math.sqrt(num);i++){
				if(num%i==0) {
					isprime=false;
					break;
					
				}
			}
			if(isprime==true) {
				System.out.print(num+" is prime");
			}
			else {
				System.out.print(num+" is not prime");
			}
		}
		

	}

}
