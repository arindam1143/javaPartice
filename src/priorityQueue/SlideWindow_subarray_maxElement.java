package priorityQueue;
import java.util.PriorityQueue;
public class SlideWindow_subarray_maxElement {
	static class pair implements Comparable<pair>{
		int val;
		int ind;
		pair(int val,int ind){
			this.val=val;
			this.ind=ind;
		}
		@Override
		public int compareTo(pair p) {
			return p.val-this.val;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,-1,5,7,8,9};
		PriorityQueue<pair> pq=new PriorityQueue<>();
		int k=3;
		int[] ans=new int[arr.length-k+1];
		int a=0;
		for(int i=0;i<k;i++) {
			pq.add(new pair(arr[i],i));
		}
		ans[a++]=pq.peek().val;
		for(int i=k;i<arr.length;i++) {
			while(pq.size()>0 && pq.peek().ind<=i-k) {
				pq.remove();
			}
			pq.add(new pair(arr[i],i));
			ans[a++]=pq.peek().val;
		}
		
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}

	}

}
