import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMedianSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int[]nums3=new int[nums1.length+nums2.length];
	        double ans=0;
	        System.arraycopy(nums1,0,nums3,0,nums1.length);
	        System.arraycopy(nums2,0,nums3,nums1.length,nums2.length);
	        Arrays.sort(nums3);
	        int m=nums3.length;
	        if(m%2!=0)
	        {
	           ans= nums3[m/2];
	        }
	        else{
	           ans= (nums3[(m/2)-1]+nums3[(m/2)])/2.0;
	        }
	        return ans;
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

  
  
 
