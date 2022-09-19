package ArraysList;
import java.util.ArrayList;
public class pairSum1 {
	// this is brute force approach
	static boolean pairsum(ArrayList<Integer> list,int target) {
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)+list.get(j)==target) {
					return true;
				}
			}
		}
		return false;
	}
	//this is only for sorted list
	// this case time complexity is O(N);
	static boolean pariSum(ArrayList<Integer> list,int target) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int target=5;
		System.out.println(pairsum(list,target));
	}

}
