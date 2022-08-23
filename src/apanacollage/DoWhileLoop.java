package apanacollage;
import java.util.Scanner;
public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		
		do {
			System.out.print("enter a num");
			int num=obj.nextInt();
			if(num%10==0) {
				System.out.println("your are out of this loop");
				break;
			}
			System.out.println(num);
			
		}
		while(true);
			
	}

}
