import java.util.*;
import java.util.List;

public class increasingBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static TreeNode increasingBST(TreeNode root) {
	        TreeNode ans=new TreeNode(0);
	        List<Integer>list=new ArrayList<>();
	        Stack <TreeNode>stack=new Stack<>();
	        stack.push(root);
	        
	        while(!stack.isEmpty()) {
	        	TreeNode curr=stack.pop();
	        	list.add(curr.val);
	        	if(curr.left!=null)stack.push(curr.left);
	        	if(curr.right!=null)stack.push(curr.right);
	        }
	        
	        Collections.sort(list);
	        TreeNode iterater=ans;
	        for(int num:list) {
	        	TreeNode newNode=new TreeNode(num);
	        	iterater.right=newNode;
	        	iterater=iterater.right;
	        }
	        
	      return ans.right;
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

  
  
 
