package Stack;
import java.util.Stack;
public class Valid_parentheses {
	static boolean validORnot(String s) {
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='('|| ch=='{' || ch=='[') {
				st.push(ch);
			}else {
			if(st.empty()) {
				return false;
			}
			if((ch==')' && st.peek()=='(')
			||(ch=='}' && st.peek()=='{')
			||(ch==']' && st.peek()=='['))
				st.pop();
			else {
				return false;
			}
		}
	}
		if(st.size()==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="{[()]}";
		System.out.println(validORnot(str));
	}

}
