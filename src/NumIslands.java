import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumIslands {

	public static void main(String[] args) {
		// https://leetcode.com/problems/number-of-islands/
		System.out.println(numIslands(new char[][] {{'1','1','1','1','0'},
													{'1','1','0','1','0'},
													{'1','1','0','0','0'},
													{'0','0','0','0','0'}}));

	}
	
	public static int numIslands(char[][] grid) {
		int r=grid.length;
		int c=grid[0].length;
        boolean[][]visited=new boolean[r][c];
        int results=0;
//        System.out.println(Arrays.deepToString(visited));
        for(int i=0;i<r;i++) {
        	for(int j=0;j<c;j++) {
        		if(grid[i][j]!='0'&&visited[i][j]==false) {
        			int up=i-1;
        			int down=i+1;
        			int left=j-1;
        			int right=j+1;
        			results++;
//        			System.out.println("grid: "+i+","+j+" num:"+grid[i][j]);
//        			System.out.println("visited: "+visited[i][j]);
        			while(up>=0&&grid[up][j]!='0'&&!visited[up][j]) {
        				System.out.println("up: "+up);
        				visited[up][j]=true;
        				grid[up][j]=Integer.toString(results).charAt(0);
        				up--;
        			}
        			System.out.println("end of up");
        			while(down<r&&grid[down][j]!='0'&&!visited[down][j]) {
        				System.out.println("dwon: "+down);
        				visited[down][j]=true;
        				grid[down][j]=Integer.toString(results).charAt(0);
        				down++;
        				
        			}
        			System.out.println("end of dwon");
        			while(left>=0&&grid[i][left]!='0'&&!visited[i][left]) {
        				System.out.println("left: "+left);
        				visited[i][left]=true;
        				grid[i][left]=Integer.toString(results).charAt(0);
        				left--;
        			}
        			System.out.println("end of left");
        			while(right<c&&grid[i][right]!='0'&&!visited[i][right]) {
        				System.out.println("right: "+right);
        				visited[i][right]=true;
        				grid[i][right]=Integer.toString(results).charAt(0);
        				right++;
        			}
        			System.out.println("end of right");
        		}else {
        			visited[i][j]=true;
        			System.out.println("else");
        		}
        		System.out.println("---------------");
        	}
        }
        
//        System.out.println(Arrays.deepToString(grid));
        
        return results;
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

  
  
 
