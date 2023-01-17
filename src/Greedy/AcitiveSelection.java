package Greedy;
import java.util.ArrayList;
public class AcitiveSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] start= {1,3,0,5,8,5};
		int[] end= {2,4,6,7,9,9};
		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(0);
		int endact=end[0];
		int Actcount=1;
		for(int i=1;i<end.length;i++) {
			if(start[i]>=endact) {
				list.add(i);
				Actcount++;
				endact=end[i];
				
			}
		}
		System.out.println(Actcount);
		System.out.println(list);
	}

}
