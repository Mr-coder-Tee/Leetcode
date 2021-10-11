import java.util.*;

public class UniquePaths {

	public static void main(String[] args) {
		// https://leetcode.com/problems/unique-paths/
	System.out.println(uniquePaths(19,18));
	}
	 public static int uniquePaths(int m, int n) {
	    boolean[][]visited=new boolean[m][n];
	    for(int i=0;i<m;i++) {
	    	for(int j=0;j<n;j++) {
	    		visited[i][j]=false;
	    	}
	    }
	   HashMap<String,Integer>dp=new HashMap<>();
	    return paths(visited,0,0,dp);
	}
	 public static int paths(boolean[][]grid,int r,int c,HashMap<String,Integer>dp) {
		 if(r+1>grid.length||c+1>grid[0].length)return 0;
		 String coordinate=Integer.toString(r)+","+Integer.toString(c);
		 if(dp.containsKey(coordinate))return dp.get(coordinate);
		 if(r==grid.length-1&&c==grid[0].length-1)return 1;
		 grid[r][c]=true;
		 int right=paths(grid,r,c+1,dp);
		 int down=paths(grid,r+1,c,dp);
		 dp.put(coordinate, right+down);
		 return right+down;
		 
	 }
}
