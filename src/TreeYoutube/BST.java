package TreeYoutube;
import java.util.ArrayList;
public class BST {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	static Node MakeBst(Node root,int data) {
		if(root==null) {
			root=new Node(data);
			return root;
		}
		if(root.data>data) {
			root.left=MakeBst(root.left,data);
		}
		else {
			root.right=MakeBst(root.right,data);
		}
		return root;
	}
	static void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	static boolean searchBst(Node root,int key) {
		if(root==null) {
			return false;
		}
		if(root.data==key) {
			return true;
		}
		else if(root.data>key) {
			return searchBst(root.left,key);
		}
		else {
			return searchBst(root.right,key);
		}
	}
	//delete node in BST
	
	static Node deleteBst(Node root,int val) {
		if(root.data>val) {
			root.left=deleteBst(root.left,val);
		}
		else if(root.data<val) {
			root.right=deleteBst(root.right,val);
		}
		else {
			if(root.left==null && root.right==null) {
				return null;
			}
			 if(root.left==null) {
				return root.right;
			}
			else if(root.right==null){
				return root.left;
			}
			 Node IS=inorderSuccesor(root.right);
			 root.data=IS.data;
			 root.right=deleteBst(root.right,IS.data);
		}
		return root;
	}
	static Node inorderSuccesor(Node root) {
		while(root.left !=null) {
			root=root.left;
		}
		return root;
	}
	//print node in Range
	public static void PrintInRange(Node root,int x,int y) {
		if(root==null) {
			return ;
		}
		if(root.data>= x && root.data<=y) {
			PrintInRange(root.left,x,y);
			System.out.println(root.data+" ");
			PrintInRange(root.right,x,y);
		}
		else if(root.data>=y) {
			PrintInRange(root.left,x,y);
		}
		else {
			PrintInRange(root.right,x,y);
		}
	}
	//print all path which reach to leaf node
	public static void PrintPath(Node root,ArrayList<Integer> path) {
		if(root==null) {
			return;
		}
		path.add(root.data);
		if(root.left==null && root.right==null) {
			
			print(path);
		}
		else {
			PrintPath(root.left,path);
			PrintPath(root.right,path);
		}
		path.remove(path.size()-1);
	}
	public static void print(ArrayList<Integer> path) {
		for(int i=0;i<path.size();i++) {
			System.out.print(path.get(i)+"->");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,9,17,18};
		Node root=null;
		for(int i=0;i<arr.length;i++) {
			root=MakeBst(root,arr[i]);
		}
		/*inorder(root);
		boolean flag=searchBst(root,1);
		System.out.println(flag);
		root=deleteBst(root,2);
		inorder(root);*/
		PrintInRange(root,4,24);
		//ArrayList<Integer> path=new ArrayList<>();
		//PrintPath(root,path);

	}

}
