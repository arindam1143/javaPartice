package priorityQueue;
import java.util.Comparator;
import java.util.PriorityQueue;
public class intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this is for general order 
		//PriorityQueue<Integer>pq=new PriorityQueue<>();
		//this is for reverse order
		PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(5);
		pq.add(1);
		pq.add(100);
		pq.add(-2);
		while(!pq.isEmpty()){
			System.out.println(pq.peek());
			pq.remove();
		}

	}

}
