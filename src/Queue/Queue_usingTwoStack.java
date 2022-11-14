package Queue;
import java.util.Stack;
public class Queue_usingTwoStack {
	static Stack<Integer> st1=new Stack<>();
	static Stack<Integer> st2=new Stack<>();
	static class Queue{
		//empty check
		static boolean isEmpty() {
			return st1.empty();
		}
		//add 
		static void add(int data) {
			while(!st1.empty()) {
				st2.push(st1.pop());
			}
			st1.push(data);
			while(!st2.empty()) {
				st1.push(st2.pop());
			}
		}
		// remove
		static int remove() {
			if(isEmpty()) {
				System.out.println("queue is empty !!!");
				return -1;
			}
			return st1.pop();
		}
		//peek
		static int peek() {
			if(isEmpty()) {
				System.out.println("queue is empty !!!");
				return -1;
			}
			return st1.peek();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue.add(1);
		Queue.add(2);
		Queue.add(3);
		while(!Queue.isEmpty()) {
			System.out.println(Queue.remove());
		}
		Queue.add(5);
		System.out.println(Queue.peek());
		
	}

}
