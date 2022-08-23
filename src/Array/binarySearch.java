package Array;

public class binarySearch {
	static int binarysearch(int[] arr,int key) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]<key){
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,5,6,7,8,9,10,12,19,45,50};
		int key=19;
		int res=binarysearch(arr,key);
		System.out.println(res);
	}

}
