package Array;
//this is for arrays sort 
import java.util.Arrays;
//this is for collections of revers order
import java.util.Collections;
public class inbild_sort {
	static void print(Integer arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {-1,8,-8484,7,9,222,-10,111,100000,-5};
		//Arrays.sort(arr);
		//print(arr);
		//Arrays.sort(arr,0,3);
		//print(arr);
		//-8484 -1 8 7 9 222 -10 111 100000 -5 (output)
	    Integer arr1[]= {-1,8,-8484,7,9,222,-10,111,100000,-5};
	    Arrays.sort(arr1,0,3,Collections.reverseOrder());
	    //8 -1 -8484 7 9 222 -10 111 100000 -5 
	    //Arrays.sort(arr1,0,3,Collections.reverseOrder());
	    //8 -1 -8484 7 9 222 -10 111 100000 -5 

	    print(arr1);
	}

}
