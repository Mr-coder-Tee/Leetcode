import java.util.Arrays;

public class SetZeroes {

	public static void main(String[] args) {
		// https://leetcode.com/problems/set-matrix-zeroes/
//		setZeroes(new int[][] {{1,1,1},{1,0,1},{1,1,1}});
		setZeroes(new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}});
	}
	 public static void setZeroes(int[][] matrix) {
	      boolean[][]isVisited=new boolean[matrix.length][matrix[0].length];
	      for(int i=0;i<matrix.length;i++) {
	    	  for(int j=0;j<matrix[0].length;j++) {
	    		  System.out.print(matrix[i][j]+",");
	    	  }
	    	  System.out.println();
	      }
	  System.out.println("----------------------------");
	      for(int r=0;r<matrix.length;r++) {
	    	  for(int c=0;c<matrix[0].length;c++) {
	    		  if(isVisited[r][c]) {
	    			  continue;
	    		  }else if(matrix[r][c]==0) {
	    			  isVisited[r][c]=true;
	    			  int up=r-1;
	    			  while(up>=0) {
	    				  if(matrix[up][c]!=0) {
	    				  matrix[up][c]=0;
	    				  isVisited[up][c]=true;
	    			  	}
	    				  up--;
	    			  }
	    			  int down=r+1;
	    			  while(down<matrix.length) {
	    				  if(matrix[down][c]!=0) {
	    				  matrix[down][c]=0;
	    				  isVisited[down][c]=true;
	    				  }
	    				  down++;
	    			  }
	    			  int left=c-1;
	    			  while(left>=0) {
	    				  if( matrix[r][left]!=0) {
	    				  matrix[r][left]=0;
	    				  isVisited[r][left]=true;
	    				  }
	    				  left--;
	    			  }
	    			  int right=c+1;
	    			  while(right<matrix[0].length) {
	    				  if( matrix[r][right]!=0) {
	    				  matrix[r][right]=0;
	    				  isVisited[r][right]=true;
	    				  }
	    				  right++;
	    			  }
	    			  
	    		  }
	    	  }
	      }
	      for(int i=0;i<matrix.length;i++) {
	    	  for(int j=0;j<matrix[0].length;j++) {
	    		  System.out.print(matrix[i][j]+",");
	    	  }
	    	  System.out.println();
	      }
	 }

}
