package sorting;

public class insertionSort {
	static void insertionsort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int cur=arr[i];
			int prev=i-1;
			//find small 
			while(prev>=0 && arr[prev]>cur) {
				arr[prev+1]=arr[prev];
				prev--;
			}
			//swap fiexd position 
			arr[prev+1]=cur;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,1,2,3};
		insertionsort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
