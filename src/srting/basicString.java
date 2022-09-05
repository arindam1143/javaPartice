package srting;

public class basicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="arindam";
		String s=new String("panja");
		//both are valid for string declarction;
		System.out.println(str);
		System.out.println(s);
		String firstname="arindam";
		String lastname="panja";
		// String concatinaction
		String fullname=firstname+" "+lastname;
		System.out.println(fullname);
		int len=fullname.length();
		//in String length is a function not propaty like array;
		System.out.println(len);
	}

}
