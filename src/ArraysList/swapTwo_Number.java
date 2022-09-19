package ArraysList;
import ArraysList.basic_opraction;
import java.util.ArrayList;

public class swapTwo_Number {
	//swap two value of this index in arraylist;
	static void swap(ArrayList<Integer> list,int indF,int indL){
	int temp=list.get(indF);
	list.set(indF,list.get(indL));
	list.set(indL,temp);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//basic_opraction obj=new basic_opraction();
		ArrayList<Integer> list=new ArrayList<>();
		list.add(50);
		list.add(70);
		list.add(10);
		list.add(150);
		list.add(200);
		list.add(1);
		//here i use the function of the same package function 
		//print function is present in  this class basic_opraction 
		basic_opraction.print(list);
		int indF=2;
		int indL=4;
		swap(list,indF,indL);
		basic_opraction.print(list);
	}

}
