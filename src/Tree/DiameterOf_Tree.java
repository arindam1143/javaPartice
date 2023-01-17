package Tree;

//import Tree.topviewOf_a_Tree.Node;

public class DiameterOf_Tree {

	//this is one way to solv this problem O(N^2)
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data){
			this.data=data;
			this.left=this.right=null;
			
		}
	}
	public static int Height(Node root) {
		if(root==null) {
			return 0;
		}
		int le=Height(root.left);
		int ri=Height(root.right);
		return Math.max(le, ri)+1;
	}
	public static int Diameter(Node root) {
		if(root==null) {
			return 0;
		}
		int ld=Diameter(root.left);
		int lh=Height(root.left);
		int rd=Diameter(root.right);
		int rh=Height(root.right);
		int self=lh+rh+1;
		return Math.max(self,Math.max(ld, rd));
	}
	
	//this is another way to solv this problem in O(N) time 
	public static class info{
		int diam;
		int ht;
		info(int diam,int ht){
			this.diam=diam;
			this.ht=ht;
		}
	}
	public static info diameter(Node root) {
		if(root==null) {
			return new info(0,0);
		}
		info lef=diameter(root.left);
		info rig=diameter(root.right);
		int dm=Math.max(Math.max(lef.diam, rig.diam), lef.ht+rig.ht+1);
		int ht=Math.max(lef.ht, rig.ht)+1;
		
		return new info(dm,ht);
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
		
		System.out.println(diameter(root).diam);

	}

}
