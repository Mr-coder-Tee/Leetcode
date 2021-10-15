import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	 public int removeDuplicates(int[] nums) {
	        if(nums.length==0)return 0;
	        int i=0;
	        for(int j=1;j<nums.length;j++)
	        {
	            if(nums[j]!=nums[i])
	            {
	                i++;
	                nums[i]=nums[j];
	            }
	            
	        }
	        return i+1;
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

  
  
 
