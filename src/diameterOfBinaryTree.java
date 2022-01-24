import java.util.*;
import java.util.List;

//import Template.TreeNode;

//import dfs.TreeNode;

public class diameterOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode r=new TreeNode();
		Integer[]num=new Integer[] {1,2,3,4,5};
		
		TreeNode root=r.arrayToTree(num);
		
		System.out.println(diameterOfBinaryTree(root));

	}
	
	
	public static int diameterOfBinaryTree(TreeNode root) {
		if(root==null)return 0;
		System.out.println(root.val);
		int left=diameterOfBinaryTree(root.left)+1;
		int right=diameterOfBinaryTree(root.right)+1;
		System.out.println("left:"+left+", right:"+right);
		System.out.println("max: "+Math.max(left, right));
		
		return Math.max(left, right);
		
		
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
	      TreeNode(){
	    	  
	      }
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	      public static TreeNode arrayToTree(Integer array[]) {
	    	    return arrayToTree(array, 0);
	      }
	     public static TreeNode arrayToTree(Integer array[], int index) {
	    	    if (index >= array.length)
	    	        return null;
	    	    if (array[index] == null)
	    	        return null;
	    	    return new TreeNode(array[index], arrayToTree(array, index * 2 + 1), arrayToTree(array, index * 2 + 2));
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

  
  
 
