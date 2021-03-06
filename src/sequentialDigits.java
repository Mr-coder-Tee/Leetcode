import java.util.*;
import java.util.List;

public class sequentialDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sequentialDigits(100,300);
	}
	 public static List<Integer> sequentialDigits(int low, int high) {
		 String digits = "123456789";
	        List<Integer> res = new ArrayList<>();
	        int nl = String.valueOf(low).length();
	        int nh = String.valueOf(high).length();
	        
	        for(int i = nl; i <= nh; i++){
	            for(int j = 0; j < 10 - i; j++){
	                int num = Integer.parseInt(digits.substring(j, j + i));
	                if(num >= low && num <= high) res.add(num);
	            }
	        }
	        return res;
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

  
  
 
