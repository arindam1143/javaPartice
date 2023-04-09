package Backtraking;

public class ChangeArr {
	public static void changeArr(int []a,int i,int val) {
		if(i==5) {
			print(a);
			return;
		}
		a[i]=val;
		changeArr(a,i+1,val+1);
		a[i]=a[i]-2;
		
	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		changeArr(arr,0,1);
		print(arr);
	}

}
