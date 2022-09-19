package LinkedList;

public class linkedlist_basic {
	  static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static class CreateNode {
		Node head = null;
		Node tail = null;

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
		void addFirst(int data) {
			Node af=new Node(data);
			if(head==null) {
				head=tail=af;
				return;
			}
			//head is store new node next part 
			af.next=head;
			//new node address is point the head;
			head=af;
		}
		void addLast(int data) {
			Node aL=new Node(data);
			if(head==null) {
				head=tail=aL;
			}
			tail.next=aL;
			tail=aL;
		}
		void addAny(int data,int indx) {
			if(indx==0) {
				addFirst(data);
				return;
			}
			if(indx==1) {
				addFirst(data);
				return;
			}
			Node aAny=new Node(data);
			Node temp=head;
			int i=0;
			while(i<indx-2) {
				temp=temp.next;
				i++;
			}
			aAny.next=temp.next;
			temp.next=aAny;
			
		}
		int healper(Node head,int key) {
			if(head==null) {
				return -1;
			}
			if(head.data==key) {
				return 0;
			}
			int ind=healper(head.next,key);
			if(ind==-1) {
				return -1;
			}
			return ind+1;
		}
		
		int RarsiveSearch(int key) {
			return healper(head,key);
		}
	}

	public static void main(String[] args) {
		//linkedlist_basic.CreateNode obj = new linkedlist_basic.CreateNode();
	//linkedlist_basic ob=new linkedlist_basic();
//	   new obj.CreateNode();
	   //ob.addNode(5);
		CreateNode ob=new CreateNode();
		ob.addNode(5);
		ob.addNode(10);
		ob.print();
		System.out.println();
		ob.addFirst(15);
		ob.addFirst(100);
		
		System.out.println("add First the node");
		ob.print();
		ob.addLast(200);
		//add lest
		System.out.println("\nadd First the node");
		ob.print();
		System.out.println("\n after add any position");
		ob.addAny(-5,2);
		ob.print();
		System.out.println("\n after add any position");
		int ind=ob.RarsiveSearch(5);
		System.out.println(ind);
		ob.print();
		
		//CreateNode obj = new linkedlist_basic().new CreateNode();

	}
}
