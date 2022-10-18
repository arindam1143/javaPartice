package Stack;
import java.util.Stack;
public class areaOfHistogram {
	 public static int largestRectangleArea(int[] heights) {
	        int len=heights.length;
	        int[] nsr=new int[len];
	        int[] nsl=new int[len];
	        int ans=0;
	        Stack<Integer> st=new Stack<>();
	        //next small find in right
	        for(int i=len-1;i>=0;i--){
	            while(!st.empty() && heights[st.peek()]>=heights[i]){
	                st.pop();
	            }
	            if(st.empty()){
	                nsr[i]=len;
	            }
	            else{
	                nsr[i]=st.peek();
	            }
	            st.push(i);
	        }
	        //next small find in left
	        st=new Stack<>();
	        for(int i=0;i<len;i++){
	            while(!st.empty() && heights[st.peek()]>=heights[i]){
	                st.pop();
	            }
	            if(st.empty()){
	                nsl[i]=-1;
	            }
	            else{
	                nsl[i]=st.peek();
	            }
	            st.push(i);
	        }
	        for(int i=0;i<len;i++){
	            int hig=heights[i];
	            int width=nsr[i]-nsl[i]-1;
	            int curr=hig*width;
	            ans=Math.max(curr,ans);
	        }
	        return ans;

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,1,5,6,2,3};
		int ans=largestRectangleArea(arr);
		System.out.println(ans);
	}

}
