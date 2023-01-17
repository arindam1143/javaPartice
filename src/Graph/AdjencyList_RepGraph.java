package Graph;
import java.util.*;
public class AdjencyList_RepGraph {
	public static class eadg{
		int src;
		int wai;
		int des;
		eadg(int s,int w,int d){
			this.src=s;
			this.wai=w;
			this.des=d;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=5;
		ArrayList<eadg>[] graph=new ArrayList[v];
		for(int i=0;i<v;i++) {
			graph[i]=new ArrayList<>();
		}
		//this is for 0
		graph[0].add(new eadg(0,5,1));
		//this is for 1
		graph[1].add(new eadg(1,5,0));
		graph[1].add(new eadg(1,1,2));
		graph[1].add(new eadg(1,3,3));
		//this is for 2
		graph[2].add(new eadg(2,1,1));
		graph[2].add(new eadg(2,1,3));
		graph[2].add(new eadg(2,2,1));
		//this is for 3
		graph[3].add(new eadg(3,3,1));
		graph[3].add(new eadg(3,1,2));
		//this is for 4
		graph[4].add(new eadg(4,2,2));
		for(int i=0;i<graph[2].size();i++) {
			eadg e=(graph[2].get(i));
			System.out.println(e.des);
		}
	}

}
