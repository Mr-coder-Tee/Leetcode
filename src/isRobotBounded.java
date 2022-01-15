import java.util.ArrayList;
import java.util.List;

public class isRobotBounded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		solutions("GGLLGG");
	}
	public static void solutions(String instructions) {
		int [][]move= {{0,1},{1,0},{0,-1},{-1,0}};
		int index=0;
		for(int i=0;i<instructions.length();i++) {
			if(instructions.charAt(i)=='G') {
				
			}else {
				
			}
		}
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

  
  
 
