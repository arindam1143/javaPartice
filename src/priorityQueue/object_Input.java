package priorityQueue;
import java.util.PriorityQueue;
import java.util.*;
public class object_Input {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Student> p=new PriorityQueue<>();
		p.add(new Student("arindam",1));
		p.add(new Student("avi",5));
		p.add(new Student("manu",10));
		while(!p.isEmpty()) {
			System.out.println(p.peek().name+"-> "+p.peek().rank);
			p.remove();
		}
	}

}
 class Student implements Comparable<Student>{
	String name;
	int rank;
	public Student(String name,int rank) {
		this.name=name;
		this.rank=rank;
	}
	@Override
	public int compareTo(Student s) {
		return this.rank - s.rank;
		
	}
}
