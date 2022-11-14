package Queue;

public class Queue_using_Array {
	public static class Queue{
		static int arr[];
		static int size;
		static int rear;
		static int front;
		Queue(int n){
			size=n;
			arr=new int[n];
			rear=-1;
			front =-1;
		}
		
		//empty check
		static boolean empty() {
			return (rear==-1 && front== -1);
		}
		//is full
		static boolean isfull() {
			return (rear+1)%size==front;
		}
		//add the queue
		static void add(int data) {
			if(isfull()) {
				System.out.println("queue is full");
				return ;
			}
			if(front==-1) {
				front =0;
			}
			rear=(rear+1)%size;
			arr[rear]=data;
		}
		//remove form the queue
		static int delete() {
			if(empty()) {
				System.out.println("empty queue!!!");
				return -1;
			}
			int ans=arr[front];
			/*for(int i=0;i<rear;i++) {
				arr[i]=arr[i+1];
			}*/
			
			
			if(rear==front) {
				rear=front=-1;
			}
			else {
				front=(front+1)%size;
			}
			
			return ans;
		}
		static int peek() {
			if(empty()) {
				System.out.print("empty queue!!!");
				return -1;
			}
			int ans=arr[front];
			return ans;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue obj=new Queue(3);
		obj.add(1);
		obj.add(2);
		obj.add(3);
		System.out.println(obj.delete()+" delete fun call");
		obj.add(4);
		System.out.println(obj.delete()+" delete fun call");
		obj.add(5);
		while(!obj.empty()) {
			System.out.println(obj.delete());
		}
	}

}
