package ArraysList;
import java.util.ArrayList;
import java.util.Collections;
public class collections_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(50);
		list.add(70);
		list.add(10);
		list.add(150);
		list.add(200);
		list.add(1);
		System.out.println(list);
		//print after Reverse order;
		Collections.reverse(list);
		System.out.println(list);
		//sort the list
		//sort also ascending order
		Collections.sort(list);
		System.out.println(list);
		//sort list decending order
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		

	}

}
