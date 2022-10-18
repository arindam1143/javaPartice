package Stack;
import java.util.Stack;
public class parestheses_Duplicate {
	static boolean isDuplicate(String s) {
		Stack<Character> st=new Stack<>();
		int count =0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==')') {
				 count =0;
				 while(st.peek() !='(') {
					 count++;
					 st.pop();
				 }
				 if(count<1) {
					 return true;
				 }
				 else {
					 st.pop();
				 }
				
			}
			else {
				st.push(ch);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="(a+b)";
		System.out.println(isDuplicate(str));
	}

}
//((a+b)) return true;
// heare extra bracket is preset
// (a+b) return false here extra bracket is not present in this line