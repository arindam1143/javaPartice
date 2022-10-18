package Stack;
import java.util.Stack;
public class ReverseString {
	static String Reverse(String str) {
		Stack<Character> st=new Stack<>();
		int i=0;
		while(i<str.length()) {
			st.push(str.charAt(i));
			i++;
		}
		StringBuilder s=new StringBuilder();
		while(!st.empty()) {
			s.append(st.pop());
		}
		str=s.toString();
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="arindam";
		
		System.out.print(Reverse(str));
	}

}
