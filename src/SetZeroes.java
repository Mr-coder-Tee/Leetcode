import java.util.Arrays;

public class SetZeroes {

	public static void main(String[] args) {
		// https://leetcode.com/problems/set-matrix-zeroes/

	}
	 public static void setZeroes(int[][] matrix) {
	      boolean[][]isVisited=new boolean[matrix.length][matrix[0].length];
	      Arrays.fill(isVisited, false);
	      for(int r=0;r<matrix.length;r++) {
	    	  for(int c=0;c<matrix[0].length;c++) {
	    		  if(isVisited[r][c]) {
	    			  continue;
	    		  }else if(matrix[r][c]==0) {
	    			  
	    		  }
	    	  }
	      }
	 }

}
