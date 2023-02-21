package Heap;
//assending order sort for max heap;
public class Heapsort {
	public static void heapify(int arr[],int n,int ind) {
		int left=2*ind+1;
		int righ=2*ind+2;
		int max=ind;
		
		if(left<n && arr[left]>arr[max]) {
			max=left;
		}
		if(righ<n && arr[righ]>arr[max]) {
			max=righ;
		}
		if(max !=ind) {
			int temp=arr[ind];
			arr[ind]=arr[max];
			arr[max]=temp;
			heapify(arr,n,max);
		}
		
	}
	public static void heapsort(int[] arr) {
		int n=arr.length;
		for(int i=n/2;i>=0;i--) {
			heapify(arr,n,i);
		}
		for(int i=n-1;i>0;i--) {
			int t=arr[0];
			arr[0]=arr[i];
			arr[i]=t;
			heapify(arr,i,0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,5,3};
		heapsort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
