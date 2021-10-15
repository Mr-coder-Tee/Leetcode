import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public static int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                return new int[]{map.get(target-nums[i]),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{0,0};
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

  
  
 
