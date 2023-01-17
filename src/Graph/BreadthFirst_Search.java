package Graph;
import java.util.*;
public class BreadthFirst_Search {
	public static class eadg{
		int src;
		int des;
		eadg(int s,int d){
			this.src=s;
			this.des=d;
		}
	}
	public static void createGraph(ArrayList<eadg>[] graph,int v) {
		
		for(int i=0;i<v;i++) {
			graph[i]=new ArrayList<>();
		}
		//this is for 0
		graph[0].add(new eadg(0,1));
		graph[0].add(new eadg(0,2));
		//this is for 1
		graph[1].add(new eadg(1,0));
		graph[1].add(new eadg(1,3));
		//this is for 2
		graph[2].add(new eadg(2,4));
		graph[2].add(new eadg(2,0));
		//this is for 3
		graph[3].add(new eadg(3,1));
		graph[3].add(new eadg(3,4));
		graph[3].add(new eadg(3,5));
		//this is for 4
		graph[4].add(new eadg(4,2));
		graph[4].add(new eadg(4,3));
		graph[4].add(new eadg(4,5));
		// this is for 5
		graph[5].add(new eadg(5,2));
		graph[5].add(new eadg(5,4));
		graph[5].add(new eadg(5,6));
		// this is for 6
		graph[6].add(new eadg(6,5));
		
		for(int i=0;i<graph[2].size();i++) {
			eadg e=(graph[2].get(i));
			System.out.println(e.des);
		}
	}
	//Breadth first search 
	public static void BFS(ArrayList<eadg>[] graph) {
		Queue<Integer> q=new LinkedList<>();
		boolean[] visit=new boolean[graph.length];
		q.add(0);
		while(!q.isEmpty()) {
			int curr=q.remove();
			if(!visit[curr]) {
				System.out.print(curr+" ");
				visit[curr]=true;
				for(int i=0;i<graph[curr].size();i++) {
					eadg e=(graph[curr].get(i));
					q.add(e.des);
				}
			}
		}
	}
	//DFS(Depth first search)
	public static void DFS(ArrayList<eadg>[] graph,int curr,boolean[] visit) {
		System.out.print(curr+" ");
		visit[curr]=true;
		for(int i=0;i<graph[curr].size();i++) {
			eadg e=graph[curr].get(i);
			if(!visit[e.des]) {
				DFS(graph,e.des,visit);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=7;
		ArrayList<eadg>[] graph=new ArrayList[v];
		createGraph(graph,v) ;
		//BFS(graph);
		boolean[] visit=new boolean[v];
		DFS(graph,0,visit);
	}

}
