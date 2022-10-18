package Stack;
import java.util.Stack;
public class nextGreater_Element {
	static int[] nextGreat(int arr[]) {
		Stack<Integer> st=new Stack<>();
		int n=arr.length;
		int[] newarr=new int[n];
		
		
		for(int i=n-1;i>=0;i--) {
			while(!st.empty() && st.peek()<=arr[i]) {
				st.pop();
			}
			newarr[i]=st.empty() ?-1:st.peek();
			st.push(arr[i]);
		}
		
		return newarr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,8,0,1,3};
		int[] newarr=new int[arr.length];
		newarr=nextGreat(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(newarr[i]);
		}
	}

}
