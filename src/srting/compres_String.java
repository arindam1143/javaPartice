package srting;

public class compres_String {
	public static String compres(String str) {
		StringBuilder st=new StringBuilder();
		
		
		for(int i=0;i<str.length();i++) {
			//st.append(str.charAt(i));
			int count=1;
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
				count++;
				i++;
			}
			st.append(str.charAt(i));
			if(count>1) {
				st.append(count);
			}
		}
		return st.toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaaabbbbcccddd";
		System.out.print(compres(str));
	}

}
