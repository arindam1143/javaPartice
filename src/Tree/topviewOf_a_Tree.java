package Tree;
import java.util.*;
public class topviewOf_a_Tree {
static class Node{
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		this.left=this.right=null;
		
	}
}
static class info{
	
	Node node;
	int hd;
	info(Node node,int hd){
		
		this.node=node;
		this.hd=hd;
	}
}
static void Topview(Node root) {
	Queue<info> q=new LinkedList<>();
	HashMap<Integer,Node> map=new HashMap<>();
	int max=0,min=0;
	q.add(new info(root,0));
	q.add(null);
	while(!q.isEmpty()) {
		info curr=q.remove();
		if(curr==null) {
			if(q.isEmpty()) {
				break;
			}else {
				q.add(null);
			}
		}
		else {
		if(!map.containsKey(curr.hd)) {
			map.put(curr.hd,curr.node);
		}
		if(curr.node.left !=null) {
			q.add(new info(curr.node.left,curr.hd-1));
			min=Math.min(curr.hd-1,min);
		}
		if(curr.node.right !=null) {
			q.add(new info(curr.node.right,curr.hd+1));
			max=Math.max(max, curr.hd+1);
		}
		}
	}
	for(int i=min;i<=max;i++) {
		if(map.containsKey(i)) {
			System.out.println(map.get(i).data);
		}
	}
	//System.out.println(map);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		Topview(root);
		

	}

}
