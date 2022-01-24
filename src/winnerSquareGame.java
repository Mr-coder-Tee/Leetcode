import java.util.*;
import java.util.List;

public class winnerSquareGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(winnerSquareGame(1));
	}
	
	 public static boolean winnerSquareGame(int n) {
		 	
		 HashMap<Integer, Boolean> cache = new HashMap<>();
	        cache.put(0, false);
	        return dfs(cache, n);
	 }
//	public static boolean dfs(int n,boolean turn) {
//		if(n==0)return !turn;
//		if(isSquare(n)) return turn;
//		for(int i=1;i<n-1;i++) {
//			if(isSquare(i)) {
//				dfs(i,!turn);
//			}
//		}
//		return turn;
//	}
	 public static boolean dfs(HashMap<Integer, Boolean> cache, int remain) {
	        if (cache.containsKey(remain)) {
	            return cache.get(remain);
	        }
	        int sqrt_root = (int) Math.sqrt(remain);
	        for (int i = 1; i <= sqrt_root; i++) {
	            // if there is any chance to make the opponent lose the game in the next round,
	            // then the current player will win.
	            if (!dfs(cache, remain - i * i)) {
	                cache.put(remain, true);
	                return true;
	            }
	        }
	        cache.put(remain, false);
	        return false;
	    }
	public static boolean isSquare(int num) {
		int n=(int)Math.sqrt(num);
		if(n*n==num)return true;
		return false;
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

  
  
 
