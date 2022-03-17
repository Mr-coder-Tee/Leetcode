import java.util.*;
import java.util.List;

public class mergeTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] tree = new Integer[]{1,3,2,5};
		Integer[] tree2 = new Integer[]{2,1,3,null,4,null,7};
		TreeNode root1=new TreeNode();
		TreeNode root2=new TreeNode();
		TreeNode r=root1.arrayToTree(tree);
		TreeNode r2=root2.arrayToTree(tree2);
		mergeTrees(r,r2);
	}
	
	
	
public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2==null)return null;
        if(root1==null)return null;
        if(root2==null)return null;
        TreeNode ans=new TreeNode(root1.val+root2.val);
        
        
        
        
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

  
  
 
