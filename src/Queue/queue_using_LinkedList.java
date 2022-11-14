package Queue;

public class queue_using_LinkedList {
 public static class Node{
	 int data;
	 Node next;
	 Node(int data){
		 this.data=data;
		 this.next=null;
	 }
 }
 public static class queue{
	static Node head =null;
	static Node tail=null;
	 
	 //empty 
	 static boolean empty() {
		 return(head==null && tail==null);
	 }
	 
	 //add
	 static void add(int data) {
		 Node obj=new Node(data);
		 if(empty()) {
			 head=obj;
			 tail=obj;
		 }
		 else {
			 tail.next=obj;
			 tail=obj;
		 }
	 }
	 //remove 
	 static int remove() {
		 if(empty()) {
			 System.out.println("Queue is empty!!");
			 return -1;
		 }
		 int ans=head.data;
		 if(head==tail) {
			 head=tail=null;
		 }else {
			 head=head.next;
		 }
		 
		 return ans;
	 }
	 static int peek() {
		 int ans=head.data;
		 return ans;
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue obj=new queue();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		System.out.println(obj.remove());
	}

}
