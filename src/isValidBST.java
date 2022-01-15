import java.util.*;
import java.util.List;

public class isValidBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(5);
		TreeNode child4=new TreeNode(4);
		TreeNode child6=new TreeNode(6);
		TreeNode child3=new TreeNode(3);
		TreeNode child7=new TreeNode(7);
		root.left=child4;
		root.right=child6;
		child6.right=child7;
		child6.left=child3;
		
		
		System.out.println(isValidBST(root));
	}
	
	
	 public static boolean isValidBST(TreeNode root) {
		 Stack<TreeNode>stack=new Stack<>();
		 stack.add(root);
		 
		 while(!stack.isEmpty()) {
			 TreeNode curr=stack.pop();
			 if(curr.left!=null&&curr.val<=curr.left.val&&curr.left.val>=root.val) {
				 return false;
			 }else if(curr.left!=null){
				 stack.add(curr.left);
			 }
			 if(curr.right!=null&&curr.val>=curr.right.val&&curr.right.val<=root.val) {
				 return false;
			 }else if(curr.right!=null){
				 stack.add(curr.right);
			 }
		 }
		 
		 return true;
		 
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

  
  
 
