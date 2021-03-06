import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumIslands {

	public static void main(String[] args) {
		// https://leetcode.com/problems/number-of-islands/
		System.out.println(numIslands(new char[][] {{'1','1','1','1','0'},
													{'1','1','0','1','0'},
													{'1','1','0','0','0'},
											{'0','0','0','0','1'}}));
		
		
	}
	
	public static int numIslands(char[][] grid) {
		int count=0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j]=='1') {
					count+=1;
					bfs(grid,i,j);
				}
			}
		}
		System.out.println("-"+Arrays.deepToString(grid));
		return count;
    }
	public static void bfs(char[][] grid,int i,int j) {
		if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]=='0')return;
		System.out.println("="+Arrays.deepToString(grid));
		grid[i][j]='0';
		bfs(grid,i+1,j);
		bfs(grid,i-1,j);
		bfs(grid,i,j-1);
		bfs(grid,i,j+1);
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

  
  
 
