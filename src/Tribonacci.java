import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tribonacci {

	public static void main(String[] args) {
		// https://leetcode.com/problems/n-th-tribonacci-number/
		System.out.println(tribonacci(25));
	}
	public static int tribonacci(int n) {
		HashMap<Integer,Integer>map=new HashMap<>();
		
		return dp(n,map);
    }
	public static int dp(int n,HashMap<Integer,Integer>map) {
		if(n<4) {
			if(n==0) {
				return 0;
			}else if(n==1||n==2) {
				return 1;
			}
		}
        if(map.containsKey(n))return map.get(n);
        
        int ans=dp(n-3,map)+dp(n-2,map)+dp(n-1,map);
        map.put(n, ans);
        
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

  
  
 
