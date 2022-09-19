package ArraysList;
import java.util.ArrayList;
public class basic_opraction {
	static void print(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		//this add opration taken O(1) time
		list.add(5);
		list.add(7);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(100);
		System.out.println(list);
		//get method 
		System.out.println(list.get(3));
		//remove method
		System.out.println(list.remove(2));
		//after remove the new arraylist is 
		System.out.println(list);
		//set function 
		list.set(3, -50);
		//set the value and then remove the preveous value
		System.out.println(list);
		//return the value true Or false;
		System.out.println(list.contains(10));
		// find size
		int size=list.size();
		System.out.println(size);
		//itrative Arraylist
		print(list);
		
	}

}
