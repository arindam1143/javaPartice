package Array;
//revers array not using any space
public class ReversArray {
	static void revers(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			/* 
			 * revers not useing any variable;
			arr[end]=arr[end]+arr[start];
			arr[start]=arr[end]-arr[start];
			arr[end]=arr[end]-arr[start];
			*/
			end--;
			start++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {4,6,7,8,9,11,12};
		revers(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
