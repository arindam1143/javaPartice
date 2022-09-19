package LinkedList;

public class Remove_Nth_fromlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    createNode ob=new createNode();
    ob.addNode(2);
    ob.addNode(12);
    ob.addNode(22);
    ob.addNode(202);
    ob.addNode(21);
    ob.addNode(20);
    ob.display();
    ob.delete_NthFrom_Last(5);
    ob.display();
	}

}
/*class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}*/
class createNode{
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
	void delete_NthFrom_Last(int n) {
		int sz=0;
		Node temp=head;
		while(temp !=null) {
			sz++;
			temp=temp.next;
		}
		//System.out.println(sz);
		if(sz==n) {
			head=head.next;
		}
		int i=1;
		temp=head;
		while(i<(sz-n)) {
			i++;
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}

}


