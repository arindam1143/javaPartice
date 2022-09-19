package ArraysList;
import java.util.ArrayList;
public class Multidymanctional_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		ArrayList<Integer> list3=new ArrayList<>();
		// add some data in three list
		for(int i=1;i<=5;i++) {
			list1.add(i*1);
			list2.add(i*2);
			list3.add(i*3);
		}
		//add sublist in mainlist
		mainlist.add(list1);
		mainlist.add(list2);
		mainlist.add(list3);
		
		//travesal the mainlist
		for(int i=0;i<mainlist.size();i++) {
			ArrayList<Integer> current=mainlist.get(i);
			for(int j=0;j<current.size();j++) {
				System.out.print(current.get(j)+" ");
			}
			System.out.println();
		}
		System.out.println(mainlist);

	}

}
