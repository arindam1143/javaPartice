package srting;

public class string_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string compare 
		String str1="avi";
		String str2="avi";
		String str3=new String("avi");
		if(str1==str2) {
			System.out.println("string are equals");
		}
		else {
			System.out.println("string are not equal");
		}
		if(str1==str3) {
			System.out.println("string are equals");
		}
		else {
			System.out.println("string are not equal");
		}
		//here last comparison return string not equal because the str3 is indicate new object
		//here we use all time the equal() function 
		if(str1.equals(str3)) {
			System.out.println("string are equals");
		}
		else {
			System.out.println("string are not equal");
		}
	}

}
