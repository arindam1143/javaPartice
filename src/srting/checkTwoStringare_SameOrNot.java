package srting;
//this is canlled anagrams string;
import java.util.Arrays;

public class checkTwoStringare_SameOrNot {
	public static boolean SameORNot(String st1, String st2) {
		st1=st1.toLowerCase();
		st2=st2.toLowerCase();
		
		if(st1.length()==st2.length()) {
			char[] st1arr=st1.toCharArray();
			char[] st2arr=st2.toCharArray();
			Arrays.sort(st1arr);
			Arrays.sort(st2arr);
			if(Arrays.equals(st1arr, st2arr)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		//return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1="arindam";
		String st2="rimadna";
		boolean ans=SameORNot(st1,st2);
		if(ans) {
			System.out.print("string are equal");
		}
		else {
			System.out.print("string are not equal");
		}
	}

}
