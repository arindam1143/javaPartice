package Stack;

import java.util.Stack;

public class Stack_usingLinkedList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
		static class s{
			static Node head=null;
			static boolean isEmpty() {
				return head==null;
			}
			static void push(int data) {
				Node newNode =new Node(data);
				if(isEmpty()) {
					head=newNode;
					return;
					
				}
				newNode.next=head;
				head=newNode;
			}
			static int pop() {
				if(isEmpty()) {
					return -1;
				}
				int top=head.data;
				head=head.next;
				return top;
			}
			static int peek() {
				if(isEmpty()) {
					return -1;
				}
				return head.data;
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s obj=new s();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		System.out.println(obj.peek());
		
		while(!obj.isEmpty()) {
			System.out.println(obj.peek());
			obj.pop();
		}
		
		/*System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());*/

	}

}
