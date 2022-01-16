import java.util.*;
import java.util.List;


public class isUnivalTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(4);
		TreeNode child1=new TreeNode(4);
		TreeNode child2=new TreeNode(4);
		TreeNode child3=new TreeNode(4);
		TreeNode child4=new TreeNode(3);
		TreeNode child5=new TreeNode(4);
		TreeNode child6=new TreeNode(4);
		
//		root.left=child1;
//		root.right=child2;
//		child1.left=child3;
//		child1.right=child4;
//		child2.left=child5;
//		child2.right=child6;
		System.out.println(isUnivalTree(root));

	}
	
	
	
	public static boolean isUnivalTree(TreeNode root) {
		if(root==null)return true;
        return dfs(root,root.val);
    }
	public static boolean dfs(TreeNode root,int val) {
		if(root==null)return true;
		if(root.val!=val)return false;
		
		return dfs(root.left,val)&&dfs(root.right,val);
		
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

  
  
 
