package Tree;
import java.util.ArrayList;
public class Lowest_Common_Ancester {
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	//lowest common ancestor 
	public static Node Ancestor(Node root,int n1,int n2) {
		ArrayList<Node> list1=new ArrayList<>();
		ArrayList<Node> list2=new ArrayList<>();
		
		getpath(root,n1,list1);
		getpath(root,n2,list2);
		
		int i=0;
		for( ;i<list1.size() && i<list2.size();i++) {
			if(list1.get(i) !=list2.get(i)) {
				break;
			}
		}
		return list1.get(i-1);
		
		
	}
	public static boolean getpath(Node root,int n,ArrayList<Node> list) {
		if(root==null) {
			return false;
		}
		list.add(root);
		if(root.data==n) {
			return true;
		}
		
		boolean lf=getpath(root.left,n,list);
		boolean ri=getpath(root.right,n,list);
		
		if(lf || ri) {
			return true;
		}
		list.remove(list.size()-1);
		return false;
	}
	//this is approach2 it is more easy
	public static Node AncestoR(Node root,int n1,int n2) {
		if(root==null) {
			return null;
		}
		if(root.data==n1 || root.data==n2) {
			return root;
		}
		Node left=AncestoR(root.left,n1,n2);
		Node right=AncestoR(root.right,n1,n2);
		
		if(left==null) {
			return right;
		}
		if(right==null) {
			return left;
		}
		return root;
	}
	
	//Minimum possible distance of Two Node
	public static int Mini_Dis(Node root,int n1,int n2) {
		Node lca=AncestoR(root,n1,n2);
		
		int leftDis=getDis(lca,n1);
		int rightDis=getDis(lca,n2);
		
		return leftDis+rightDis;
	}
	
	public static int getDis(Node root,int n) {
		if(root==null) {
			return -1;
		}
		if(root.data==n) {
			return 0;
		}
		int left=getDis(root.left,n);
		int right=getDis(root.right,n);
		
		if(left==-1 && right==-1) {
			return -1;
		}
		else if(left==-1) {
			return right+1;
		}
		else {
			return left+1;
		}
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
		System.out.println(Ancestor(root,4,6).data);
		System.out.println(AncestoR(root,4,6).data);
		System.out.println(Mini_Dis(root,4,5));
	}

}
