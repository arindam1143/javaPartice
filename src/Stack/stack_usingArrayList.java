package Stack;
import java.util.ArrayList;
//implement stack using ArrayList;
public class stack_usingArrayList {
	static class Stack{
		static ArrayList<Integer> list=new ArrayList<>();
		static boolean isEmpty() {
			if(list.size()==0) {
				return true;
			}
			return false;
		}
		//push the data in arraylist;
		static void push(int data) {
			list.add(data);
		}
		static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top=list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return list.get(list.size()-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack obj=new Stack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		while(!obj.isEmpty()) {
			System.out.println(obj.pop());
		}
		System.out.println(obj.peek());
		obj.push(100);
		System.out.println(obj.peek());
		
	}

}
