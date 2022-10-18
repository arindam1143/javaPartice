package LinkedList;

public class DecetedLoop {
 //static Node head=null;

  static class Node{
	 int data;
	 Node next;
	 Node(int data){
		 this.data=data;
		 next=null;
	 }
 }
  
  static boolean isCycle(Node head) {
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
	public static void main(String[] args) {
		//DecetedLoop obj = new DecetedLoop();
		Node head=new Node(5);
		head.next=new Node(10);
		head.next.next=new Node(15);
		head.next.next.next=null;
		boolean ans=isCycle(head);
		System.out.print(ans);
	}

}
