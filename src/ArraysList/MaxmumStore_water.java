package ArraysList;
import java.util.ArrayList;
public class MaxmumStore_water {
	//this is brute force approach
	// this is time complexity is O(N^2);
	static int storeWater(ArrayList<Integer> list) {
		int max=0;
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				int high=Math.min(list.get(i),list.get(j));
				int width=j-i;
				int currmax=high*width;
				max=Math.max(max, currmax);
			}
		}
		return max;
	}
	// this is 2 pointer approach
	// this case time complexity is O(N)
	public static int Storewater(ArrayList<Integer> list) {
		int max=0;
		int lp=0;
		int rp=list.size()-1;
		while(lp<rp) {
			int high=Math.min(list.get(lp),list.get(rp));
			int width=rp-lp;
			int currwater=high*width;
			max=Math.max(max, currwater);
			
			if(list.get(lp)<list.get(rp)) {
				lp++;
			}
			else {
				rp--;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		//1,8,6,2,5,4,8,3,7
		list.add(1);
		list.add(8);
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(8);
		list.add(3);
		list.add(7);
		System.out.println("this is burte force approach  "+storeWater(list));
		System.out.println(Storewater(list));
	}

}
