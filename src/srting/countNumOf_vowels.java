package srting;

public class countNumOf_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String st="arindam panja";
		String st1=st.toLowerCase();
		for(int i=0;i<st1.length();i++) {
			char a=st1.charAt(i);
			if(a=='a'|| a=='e'|| a=='i'||a=='o'||a=='u') {
				count++;
			}
		}
		System.out.print(count);
	}

}
