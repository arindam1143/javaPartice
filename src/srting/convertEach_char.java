package srting;

public class convertEach_char {
	public static String convertUppercase(String str) {
		StringBuilder st=new StringBuilder();
		st.append(Character.toUpperCase(str.charAt(0)));
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==' ' && i<str.length()-1) {
				st.append(str.charAt(i));
				i++;
				st.append(Character.toUpperCase(str.charAt(i)));
			}
			else {
				st.append(str.charAt(i));
			}
		}
		return st.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hi i am arindam panja";
		System.out.println(convertUppercase(str));
	}

}
//use the predefine function 
//Character.toUpperCase();