package LinkedList;
//delete cyecle in linked lint
public class cycle_PresentORnot {
	static Node head=null;
	static Node tail=null;
	 static class Node {
			int data;
			Node next;

			Node(int data) {
				this.data = data;
				this.next = null;
			}
		}
	 static boolean iscycle(Node head) {
		 
		 Node slow=head;
		 Node fast=head;
		 while(fast !=null && fast.next !=null) {
			 slow=slow.next;
			 fast=fast.next.next;
			 if(slow==fast) {
				 return true;
			 }
		 }
		 return false;
	 }
	 static void deleteCycle() {
		 Node slow=head;
		 Node fast=head;
		 boolean flag=false;
		 while(fast !=null && fast.next !=null) {
			 slow=slow.next;
			 fast=fast.next.next;
			 if(slow==fast) {
				 flag=true;
				 break;
			 }
		 }
		 slow=head;
		 Node prev=null;
		 if(flag) {
			 while(slow !=fast) {
				 prev=fast;
				 slow=slow.next;
				 fast=fast.next;
			 }
		 }
		 prev.next=null;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 head=new Node(1);
		Node temp= head.next=new Node(2);
		 head.next.next=new Node(3);
		 head.next.next.next=new Node(4);
		 head.next.next.next.next=temp;
		 //1->2->3->1
		 System.out.println(iscycle(head));
		deleteCycle();
		System.out.println(iscycle(head));
		
	}

}
