package Array;

public class printAllsubArray {
	static void printSubarray(int arr[]) {
		//int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int z=i;z<=j;z++) {
					//sum+=arr[z];
					System.out.print(arr[z]+" ");
					
				}
				//System.out.print(sum+" ");
				//sum=0;
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,4,7,9,52,45,2};
		printSubarray(arr);
	}

}
