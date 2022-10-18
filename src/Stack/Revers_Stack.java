package Stack;
import java.util.Stack;
public class Revers_Stack {
	static void addBotton(Stack<Integer> st,int data) {
		if(st.empty()) {
			st.push(data);
			return;
		}
		int t=st.pop();
		addBotton(st,data);
		st.push(t);
	}
	static void Reverse(Stack<Integer> st) {
		if(st.empty()) {
			return;
		}
		int t=st.pop();
		Reverse(st);
		addBotton(st,t);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		System.out.println(st);
		addBotton(st,4);
		System.out.println(st);
		//revers the stack 
		Reverse(st);
		System.out.print(st);
	}

}
