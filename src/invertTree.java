import java.util.*;
import java.util.List;

public class invertTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(4);
		TreeNode child1=new TreeNode(2);
		TreeNode child2=new TreeNode(7);
		TreeNode child3=new TreeNode(1);
		TreeNode child4=new TreeNode(3);
		TreeNode child5=new TreeNode(6);
		TreeNode child6=new TreeNode(9);
		
		root.left=child1;
		root.right=child2;
		child1.left=child3;
//		child1.right=child4;
//		child2.left=child5;
//		child2.right=child6;
		
		TreeNode ans=invertTree(root);
		TreeNode display=new TreeNode();
		
		display.display(ans);

	}
	
	
	public static TreeNode invertTree(TreeNode root) {
		if(root==null)return root;
		TreeNode ans=new TreeNode(root.val);
		dfs(root.left,root.right,ans);
		return ans;
    }
	public static void dfs(TreeNode root1,TreeNode root2,TreeNode main) {
		if(root1==null&&root2==null)return;
		if(root1==null||root2==null) {
			if(root1!=null) {
				main.right=root1;
				dfs(root1.left,root2,main.right);
			}
			if(root2!=null) {
				main.left=root2;
				dfs(root1,root2.left,main.left);
			}
			return;
		}
		if(root1!=null||root2!=null) {	
			main.right=root1;
			main.left=root2;
		}
		
		dfs(root1.left,root2.right,main.left);
		dfs(root1.right,root2.left,main.right);
		
		
		
	}
	
	
	
	static  class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	      
	      public void display(TreeNode treenode) {
	    	  if(treenode==null)return;
	    	  System.out.print(treenode.val+",");
	    	  display(treenode.left);
	    	  display(treenode.right);
	    	  
	      }
	 }
	
	static class Node {
	    public int val;
	    public List<Node> neighbors;
	    public Node() {
	        val = 0;
	        neighbors = new ArrayList<Node>();
	    }
	    public Node(int _val) {
	        val = _val;
	        neighbors = new ArrayList<Node>();
	    }
	    public Node(int _val, ArrayList<Node> _neighbors) {
	        val = _val;
	        neighbors = _neighbors;
	    }
	}

}

  
  
 
