import java.util.*;
public class MaxDepth {

	public static void main(String[] args) {
		// https://leetcode.com/problems/maximum-depth-of-binary-tree/
		
		Node root=new Node(3);
		Node left=new Node(7);
		Node right=new Node(9);
		Node rightleft=new Node(31);
		Node rightright=new Node(13);
		
		root.children.add(right);
		root.children.add(left);
		left.children.add(rightleft);
		rightleft.children.add(rightright);
		System.out.println(maxDepth(root));

	}
	public static int maxDepth(Node root) {
        if(root==null)return 0;
        
        int max=1;
        for(Node node:root.children) {
        	int depth=maxDepth(node)+1;
        	max=Math.max(depth, max);
        }
        
        
        return max;
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
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};

}

  
  
 
