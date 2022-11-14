package Queue;
import java.util.Queue;
import java.util.LinkedList;
public class Queue_using_predefineFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> obj=new LinkedList<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		System.out.println(obj.remove());
	}

}
