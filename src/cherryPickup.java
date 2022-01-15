import java.util.ArrayList;
import java.util.List;

public class cherryPickup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cherryPickup(new int[][]{{3,1,1},{2,5,1},{1,5,5},{2,1,1}});
	}
	
	
	 public static int cherryPickup(int[][] grid) {
	       
		 int m = grid.length;
	        int n = grid[0].length;
	        int[][][] dpCache = new int[m][n][n];
	        // initial all elements to -1 to mark unseen
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                for (int k = 0; k < n; k++) {
	                    dpCache[i][j][k] = -1;
	                }
	            }
	        }
	        return dp(0, 0, n - 1, grid, dpCache);
	 }
	
	 private static int dp(int row, int col1, int col2, int[][] grid, int[][][] dpCache) {
	        if (col1 < 0 || col1 >= grid[0].length || col2 < 0 || col2 >= grid[0].length) {
	            return 0;
	        }
	        // check cache
	        if (dpCache[row][col1][col2] != -1) {
	            return dpCache[row][col1][col2];
	        }
	        // current cell
	        int result = 0;
	        result += grid[row][col1];
	        if (col1 != col2) {
	            result += grid[row][col2];
	        }
	        // transition
	        if (row != grid.length - 1) {
	            int max = 0;
	            for (int newCol1 = col1 - 1; newCol1 <= col1 + 1; newCol1++) {
	                for (int newCol2 = col2 - 1; newCol2 <= col2 + 1; newCol2++) {
	                    max = Math.max(max, dp(row + 1, newCol1, newCol2, grid, dpCache));
	                }
	            }
	            result += max;
	        }

	        dpCache[row][col1][col2] = result;
	        return result;
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

  
  
 
