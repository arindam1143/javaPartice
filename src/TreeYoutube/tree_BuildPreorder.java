package TreeYoutube;

public class tree_BuildPreorder {
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
	static class binaryTree{
		static int ind=-1;
		public static Node BuildPreorder(int[] arr) {
			ind++;
			if(arr[ind]==-1) {
				return null;
			}
			Node obj=new Node(arr[ind]);
			obj.left=BuildPreorder(arr);
			obj.right=BuildPreorder(arr);
			
			return obj;
		}
	}
	//preorder travesel 
	public static void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void inorder(Node root) {
		if(root==null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void postorder(Node root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	//count the node
	public static int countNode(Node root) {
		if(root==null) {
			return 0;
		}
		int leftcount=countNode(root.left);
		int rightcount=countNode(root.right);
		return leftcount+rightcount+1;
	}
	//sum of Node
	public static int sumNode(Node root) {
		if(root==null) {
			return 0;
		}
		int leftsum=sumNode(root.left);
		int rightsum=sumNode(root.right);
		return leftsum+rightsum+root.data;
	}
	//height of the tree
	public static int height(Node root) {
		if(root==null) {
			return 0;
		}
		int left=height(root.left);
		int right=height(root.right);
		int myheight=Math.max(left, right)+1;
		return myheight;
	}
	//Diamiter of a tree O(N^2)
	public static int Diamiter(Node root) {
		if(root==null) {
			return 0;
		}
		int ld=Diamiter(root.left);
		int rd=Diamiter(root.right);
		int d=height(root.left)+height(root.right)+1;
		return Math.max(d,Math.max(rd, ld));
	}
	//diameter of a tree O(N)
	static class TreeInfo{
		int ht;
		int dia;
		TreeInfo(int ht,int dia){
			this.ht=ht;
			this.dia=dia;
		}
	}
	public static TreeInfo diameter(Node root) {
		if(root==null) {
			return new TreeInfo(0,0);
		}
		TreeInfo left=diameter(root.left);
		TreeInfo right=diameter(root.right);
		int myHeight=Math.max(left.ht, right.ht)+1;
		 int ld=left.dia;
		 int rd=right.dia;
		 int height=left.ht+right.ht+1;
		 int diam=Math.max(height,Math.max(rd, ld));
		 TreeInfo obj=new TreeInfo(myHeight,diam);
		 return obj;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		binaryTree tree=new binaryTree();
		Node root=tree.BuildPreorder(arr);
		//System.out.println(root.data);
		//preorder(root);
		//inorder(root);
		//postorder(root);
		//int noOfNode=countNode(root);
		//System.out.println(noOfNode);
		//int sumOfNode=sumNode(root);
		//System.out.println(sumOfNode);
		//System.out.println("height of given tree is "+height(root));
		//System.out.println(Diamiter(root));
		System.out.println(diameter(root).dia);
	}

}
