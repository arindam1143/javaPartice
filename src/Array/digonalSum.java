package Array;

public class digonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};//{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		//digonal sum
		
		int Sum=0;
		/*
		 this is O(N^2) time complexcity
		  int sum=0;
		 for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(i==j) {
					sum+=matrix[i][j];
				}
				else if((i+j)==matrix.length-1) {
					sum=sum+matrix[i][j];
				}
			}
		}
		System.out.println(sum);
		*/
		// this is O(N) complexcity
		for(int i=0;i<matrix.length;i++) {
			Sum+=matrix[i][i];
			
			if(i !=matrix.length-1-i) {
				Sum+=matrix[i][matrix.length-1-i];
			}
			
			
		}
		System.out.println(Sum);
	}

}
