package LinkedList;

public class palindromORnot {
	static Node head = null;
	static Node tail = null;
	 static class Node {
			int data;
			Node next;

			Node(int data) {
				this.data = data;
				this.next = null;
			}
		}
	 static class CreateNode {
			

			void addNode(int data) {
				Node obj = new Node(data);
				if (head == null) {
					head = obj;
					tail = obj;
				} else {
					tail.next = obj;
					tail = obj;
				}
			}

			void print() {
				Node temp = head;
				if (temp == null) {
					System.out.println("Your linked list is empty");
				} else {
					while (temp != null) {
						System.out.print(temp.data+" ");
						temp = temp.next;
					}
				}
			}
			
	 }
	 static boolean ispalindrom(Node head) {
		 Node temp=head;
		 if(head==null) {
			 return false;
		 }
		 if(head.next==null) {
			 return true;
		 }
		 Node slow=head;
		 Node fast=head;
		 while(fast !=null && fast.next !=null) {
			 slow=slow.next;
			 fast=fast.next.next;
		 }
		 Node next=null;
		 Node curr=slow;
		 Node prev=null;
		 while(curr !=null) {
			 next=curr.next;
			 curr.next=prev;
			 prev=curr;
			 curr=next;
		 }
		 slow=prev;
		 while(temp !=null && slow !=null) {
			 if(temp.data !=slow.data)
				 return false;
			 
			 temp=temp.next;
			 slow=slow.next;
		 }
		 return true;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateNode obj=new CreateNode ();
		obj.addNode(1);
		obj.addNode(1);
		obj.addNode(1);
		obj.addNode(1);
		obj.addNode(1);
		obj.print();
		System.out.println(ispalindrom(head));
		
	}

}
