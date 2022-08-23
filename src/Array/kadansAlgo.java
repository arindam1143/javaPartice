package Array;

public class kadansAlgo {
	static int kadans(int arr[]) {
		int sum=Integer.MIN_VALUE;
		int currsum=arr[0];
		for(int i=0;i<arr.length;i++) {
			currsum+=arr[i];
			 if(currsum<0){
				currsum=0;
			}
			 sum=Math.max(currsum, sum);
			 
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<0)
				count++;
		}
		System.out.println("total negative ele is "+count);
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[] {-2,-3,4,-1,-2,5,11,-3};
		int sum=kadans(arr);
		System.out.println(sum);

	}

}
