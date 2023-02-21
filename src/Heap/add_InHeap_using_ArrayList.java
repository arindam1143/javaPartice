package Heap;
import java.util.ArrayList;
public class add_InHeap_using_ArrayList {
	static class Heap{
		ArrayList<Integer> list=new ArrayList<>();
		public void add(int data) {
			list.add(data);
			
			//find child and parent index from arraylist
			int chi=list.size()-1;
			int par=(chi-1)/2;
			//swap child and present 
			
			while(list.get(chi)<list.get(par)) {
				 
				int temp=list.get(par);
				list.set(par, list.get(chi));
				list.set(chi, temp);
				chi=par;
				par=(chi-1)/2;
			}
		}
		public int peek() {
			return list.get(0);
		}
		//remove function ---there is three stap
		// swap first and last index in arrayList
		//delete last index element
		//call heapify function
		
		//create heapify function
		private void heapify(int ele) {
			
			int left=(2*ele)+1;
			int righ=(2*ele)+2;
			int ind=ele;
			if(left<list.size() && list.get(ind)>list.get(left)){
				ind=left;
			}
			if(righ<list.size() && list.get(ind)>list.get(righ)) {
				ind=righ;
			}
			if(ind !=ele) {
				int temp=list.get(ele);
				list.set(ele, list.get(ind));
				list.set(ind, temp);
				
				heapify(ind);
			}
		}
		public int remove() {
			int data=list.get(0);
			//swap
			int temp=list.get(0);
			list.set(0, list.get(list.size()-1));
			list.set(list.size()-1, temp);
			
			//remove ele form last
			list.remove(list.size()-1);
			heapify(0);
			return data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap obj=new Heap();
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(10);
		obj.add(11);
		obj.add(1);
		
		System.out.println(obj.list);
		System.out.println(obj.remove());
		System.out.println(obj.list);
		

	}

}
