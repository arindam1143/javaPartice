package sorting;

public class selectionSort {
	static void SelectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			//swap 
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,1,7,2,3,-1,5};
		SelectionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
