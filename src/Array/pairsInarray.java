package Array;
//count the pairs rule is ((n*(n-1))/2)
public class pairsInarray {
	static void countPairs(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.print("("+arr[i]+","+arr[j]+")    ");
				count++;
			}
			System.out.println();
		
		}
		System.out.println("pairs of this problem "+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,5,6,7,12};
		countPairs(arr);
	}

}
