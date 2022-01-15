import java.util.*;
import java.util.List;



public class rangeSumBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		TreeNode child2=new TreeNode(2);
		TreeNode child3=new TreeNode(3);
		TreeNode child4=new TreeNode(4);
		TreeNode child5=new TreeNode(5);
		TreeNode child6=new TreeNode(6);
		TreeNode child7=new TreeNode(7);
		TreeNode child8=new TreeNode(8);
		
		
		root.left=child2;
		root.right=child3;
		child2.left=child4;
		child2.right=child5;
		child3.left=child6;
		child3.right=child7;
		child4.right=child8;
		System.out.println(rangeSumBST(root,5,8));
		
		
	}
	
	
	
	
	public static int rangeSumBST(TreeNode root, int low, int high) {
        Stack <TreeNode>stack=new Stack<>();
        List<Integer>list=new ArrayList<>();
        stack.push(root);
        while(!stack.isEmpty()) {
        	TreeNode current=stack.pop();
        	if(current.val>=low&&current.val<=high)list.add(current.val);
        	if(current.left!=null)stack.push(current.left);
        	if(current.right!=null)stack.push(current.right);     	
        }
        
        int sum=0;
        for(int num:list) {
        	sum+=num;
        }
        return sum;
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

  
  
 
