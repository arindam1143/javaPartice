package srting;

public class find_subString {
	static String findSubstring(String str,int st,int en) {
		String sub="";
		for(int i=st;i<en;i++) {
			sub+=str.charAt(i);
		}
		return sub;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Arindam panja";
		//find substring method substring
		String sub=str.substring(0,5);
		System.out.println(sub+"  predefine");
		System.out.print(findSubstring(str,0,5));
	}

}
