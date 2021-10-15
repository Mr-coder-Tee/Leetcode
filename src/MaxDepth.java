
public class MaxDepth {

	public static void main(String[] args) {
		// https://leetcode.com/problems/maximum-depth-of-binary-tree/
		
		TreeNode root=new TreeNode(3);
		TreeNode left=new TreeNode(7);
		TreeNode right=new TreeNode(9);
		TreeNode rightleft=new TreeNode(31);
		TreeNode rightright=new TreeNode(13);
		
		root.left=left;
		root.right=right;
		right.left=rightleft;
		right.right=rightright;
		System.out.println(maxDepth(root));

	}
	public static int maxDepth(TreeNode root) {
        if(root==null)return 0;
        
        int left=maxDepth(root.left)+1;
        int right=maxDepth(root.right)+1;
        
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
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	 }

}

  
  
 
