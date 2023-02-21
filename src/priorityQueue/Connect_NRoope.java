package priorityQueue;
//connect N Ropes in minimum cost
import java.util.PriorityQueue;
public class Connect_NRoope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,3,6,4};
		PriorityQueue<Integer> p=new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			p.add(arr[i]);
		}
		int minCost=0;
		while(p.size()>1) {
			int min1=p.remove();
			int min2=p.remove();
			minCost+=min1+min2;
			p.add(min1+min2);
		}
		System.out.print(minCost);

	}

}
