package LinkedList;
// very importent quesction 
public class Revers_LL {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CreateNode22 ob=new CreateNode22();
    ob.addNode(2);
    ob.addNode(12);
    ob.addNode(22);
    ob.addNode(202);
    ob.addNode(21);
    ob.addNode(20);
    ob.display();
    ob.ReversLL();
    ob.display();
	}

}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
class CreateNode22{
	Node head=null;
	Node tail=null;
	void addNode(int data) {
		Node obj=new Node(data);
		if(head==null) {
			head=obj;
			tail=obj;
		}
		else {
			tail.next=obj;
			tail=obj;
		}
	}
	void display() {
		Node curr=head;
		if(curr==null) {
			System.out.println("your linked list is empty");
		}
		while(curr !=null) {
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		System.out.println("null");
	}
	void ReversLL() {
		Node prev=null;
		Node curr=tail=head;
		Node next;
		while(curr !=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
}
