package partten;

public class invertaed_halfNumver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
/* out put
1 2 3 4 
1 2 3 
1 2 
1 
 */
