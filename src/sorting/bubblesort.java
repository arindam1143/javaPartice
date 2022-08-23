package sorting;

public class bubblesort {
	static void sort(int[] arr) {
		int n=arr.length;
		int check=0;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					//swap
					check=1;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(check==0) {
				System.out.println("your arrays is already sorged");
				return;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {10,12,5,1,-9,2};//{1,2,13,4};//
		int arr[]={1,2,13,-5};
	    sort(arr);
	    for(int i=0;i<arr.length;i++) {
	    	System.out.print(arr[i]+" ");
	    }
	}

}
