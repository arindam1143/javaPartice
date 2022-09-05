package srting;

public class String_ispallindrom {
	static boolean ispalindrom(String str) {
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i) !=str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="racecar";
		System.out.print(ispalindrom(str));
		
	}

}
