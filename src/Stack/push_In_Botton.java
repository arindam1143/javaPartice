package Stack;
import java.util.Stack;
public class push_In_Botton {
	static void addBotton(Stack<Integer> st,int data) {
		if(st.isEmpty()) {
			st.push(data);
			return ;
		}
		int top=st.pop();
		addBotton(st,data);
		st.push(top);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		//System.out.println(st.pop());
		
		//add 6 in last in the saack using recursion
		addBotton(st,6);
		//System.out.println(st.pop());
		System.out.println(st);
	}

}
