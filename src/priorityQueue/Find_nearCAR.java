package priorityQueue;
import java.util.PriorityQueue;
public class Find_nearCAR {
 public static class findCAR implements Comparable<findCAR>{
	 int x;
	 int y;
	 int des;
	 int ind;
	 findCAR(int x,int y,int des,int ind){
		 this.x=x;
		 this.y=y;
		 this.des=des;
		 this.ind=ind;
	 }
	 @Override
	 public int compareTo(findCAR p) {
		 return this.des-p.des;
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{3,3},{5,-1},{-2,4}};
		int k=2;
		PriorityQueue<findCAR>pq=new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			int des=arr[i][0]*arr[i][0]+arr[i][1]*arr[i][1];
			pq.add(new findCAR(arr[i][0],arr[i][1],des,i));
		}
		for(int i=0;i<k;i++) {
			System.out.println("c"+pq.remove().des);
		}

	}

}
