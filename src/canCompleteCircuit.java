import java.util.*;
import java.util.List;

public class canCompleteCircuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canCompleteCircuit(new int[] {1,2,3,4,5},new int[] {3,4,5,1,2}));
	}
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int tank=0;
        for(int i=0;i<cost.length;i++) {
        	int c=cost[i];
        	int g=1;
        	if(c<gas.length) {
        		g=gas[c];
        	}
        	tank=tank-i+g;
        	if(tank<0) {
        		return -1;
        	}
        }
        
        return tank;
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

  
  
 
