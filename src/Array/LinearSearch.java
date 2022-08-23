package Array;
//linear search..................................................................
public class LinearSearch {
	
	static int Linearsearch(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {10,5,7,8,9,10,5,7};
		int key=5;
		int res=Linearsearch(arr,key);
		if(res==-1) {
			System.out.println("your key is not present in this array");
		}
		else {
			System.out.println("your key is present in this array at "+res+" position");
		}
		
	}

}
