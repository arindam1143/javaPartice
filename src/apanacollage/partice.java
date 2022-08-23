package apanacollage;

public class partice {
	
	static int a=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(a);
   
	}
}

	//Margesort partice in this scope
	/*
	 * byte a=5;
   a=(byte)(a*2);
   System.out.print(a);
	 * 
	 * 
	 * static void divide(int arr[],int low,int high) {
	 
		
		if(low<high) {
			int mid=(low+high)/2;
			divide(arr,low,mid);
			divide(arr,mid+1,high);
			Marge(arr,low,mid,high);
		}
	}
	static void Marge(int arr[],int low,int mid,int high) {
		int len1=mid-low+1;
		int len2=high-mid;
		int[] arr1=new int[len1];
		int[] arr2=new int[len2];
		for(int i=0;i<len1;i++) {
			arr1[i]=arr[low+i];
		}
		for(int i=0;i<len2;i++) {
			arr2[i]=arr[mid+1+i];
		}
		//finial array marge
		int a=0;int b=0;int c=low;
		while(a<len1 && b<len2) {
			if(arr1[a]<arr2[b]) {
				arr[c]=arr1[a];
				a++;
				c++;
			}
			else {
				arr[c]=arr2[b];
				b++;
				c++;
			}
		}
		while(a<len1) {
			arr[c]=arr1[a];
			c++;
			a++;
		}
		while(b<len2) {
			arr[c]=arr2[b];
			b++;c++;
		}
		
		
	}
	public static void main(String[] args) {
		int[] arr= {4,0,-200,50,40,8,3,-256,78,8,3,3,100,1000};
		int len=arr.length;
		int low=0;
		int high=len-1;
		divide(arr,low,high);
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
	
*/