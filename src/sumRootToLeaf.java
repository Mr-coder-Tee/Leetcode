import java.util.*;
import java.util.List;

public class sumRootToLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[1,0,1,0,1,0,1]
		
		TreeNode root=new TreeNode(1);
		TreeNode root1=new TreeNode(0);
		TreeNode root2=new TreeNode(1);
		TreeNode root3=new TreeNode(0);
		TreeNode root4=new TreeNode(1);
		TreeNode root5=new TreeNode(0);
		TreeNode root6=new TreeNode(1);
		
		root.left=root1;
		root.right=root2;
		root1.left=root3;
		root1.right=root4;
		root2.left=root5;
		root2.right=root6;
		sumRootToLeaf(root);
	}
	
	
	public static int sumRootToLeaf(TreeNode root) {
        Stack<TreeNode>stack=new Stack<>();
        List<String>list=new ArrayList<>();
        String bit=Integer.toString(root.val);
        stack.push(root);
        
        while(!stack.isEmpty()) {
        	TreeNode curr=stack.pop();
        	bit+=Integer.toString(curr.val);
        	
        	if(curr.left!=null) {
        		stack.push(curr.left);
        	}else {
        		list.add(bit);
        	}
        	if(curr.right!=null) {
        		stack.push(curr.right);
        	}else {
        		list.add(bit);
        	}
        	
        }
        
        return 1;
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

  
  
 
