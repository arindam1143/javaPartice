package apanacollage;
import java.util.Scanner;
public class continuestatesment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		do {
			System.out.print("enter num");
			int num=obj.nextInt();
			if(num%10==0) {
				continue;
			}
			System.out.println("your number was "+num);
		}while(true);
		

	}

}
