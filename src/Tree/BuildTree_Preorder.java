package Tree;
import java.util.*;
public class BuildTree_Preorder {
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
	static class BuildTree{
		static int ind=-1;
		static Node buildtree(int[] arr) {
			ind++;
			if(arr[ind]==-1) {
				return null;
			}
			Node newNode=new Node(arr[ind]);
			newNode.left=buildtree(arr);
			newNode.right=buildtree(arr);
			return newNode;
		}
		
		static void preorder(Node root) {
			if(root==null) {
				return;
			}
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
		static void Inorder(Node root) {
			if(root==null) {
				return;
			}
			Inorder(root.left);
			System.out.print(root.data+" ");
			Inorder(root.right);
		}
		static void postorder(Node root) {
			if(root==null) {
				return;
			}
			
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
		//Level order 
		// level order in a single line 
		static void LevelOrder(Node root) {
			if(root==null) {
				return;
			}
			Queue<Node> qu=new LinkedList<>();
			qu.add(root);
			while(!qu.isEmpty()) {
				Node curr =qu.remove();
				System.out.print(curr.data+" ");
				if(curr.left !=null) {
					qu.add(curr.left);
				}
				if(curr.right !=null) {
					qu.add(curr.right);
				}
			}
			
		}
		static void levelorder(Node root) {
			if(root==null) {
				return;
			}
			Queue<Node> qu=new LinkedList<>();
			qu.add(root);
			qu.add(null);
			while(!qu.isEmpty()) {
				Node curr=qu.remove();
				if(curr==null) {
					System.out.println();
					if(qu.isEmpty()) {
						break;
					}
					else {
						qu.add(null);
					}
				}
				else {
					System.out.print(curr.data+" ");
					if(curr.left !=null) {
						qu.add(curr.left);
					}
					if(curr.right !=null) {
						qu.add(curr.right);
					}
				}
			}
		}
		//Height of Tree
		static int Height(Node root) {
			if(root==null) {
				return 0;
			}
			int lh=Height(root.left);
			int rh=Height(root.right);
			int h=Math.max(lh, rh)+1;
			
			return h;
		}
		static int Count(Node root) {
			if(root==null) {
				return 0;
			}
			int leftcount=Count(root.left);
			int rightcount=Count(root.right);
			
			return leftcount+rightcount+1;
		}
		//sum of all node
		static int SumOfNode(Node root) {
			if(root==null) {
				return 0;
			}
			int leftsum=SumOfNode(root.left);
			int rightsum=SumOfNode(root.right);
			
			return leftsum+rightsum+root.data;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BuildTree obj=new BuildTree();
		 Node root=obj.buildtree(arr);
		//Node root=BuildTree.buildtree(arr);
		 //System.out.print(root.data);
		// obj.preorder(root);
		 //obj.Inorder(root);
		 //obj.postorder(root);
		// obj.LevelOrder(root);
		 //obj.levelorder(root);
		// int h=obj.Height(root);
		 //System.out.println(h);
		// int nodecount=obj.Count(root);
		// System.out.println(nodecount);
		 System.out.println(obj.SumOfNode(root));
	}

}
