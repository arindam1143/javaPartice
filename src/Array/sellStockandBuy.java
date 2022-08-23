package Array;

public class sellStockandBuy {
	static int sellStock(int[] arr) {
		int buystock=Integer.MAX_VALUE;
		int maxprofit=0;
		for(int i=0;i<arr.length;i++) {
			if(buystock<arr[i]) {
				int profit=arr[i]-buystock;
				maxprofit=Math.max(profit, maxprofit);
			}
			else {
				buystock=arr[i];
			}
		}
		
		return maxprofit;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7};
		System.out.print(sellStock(arr));

	}

}
