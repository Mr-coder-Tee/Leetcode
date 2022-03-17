import java.util.*;
import java.util.List;

public class checkStraightLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] tree = new Integer[]{1, null, 2, 3};
		TreeNode root=new TreeNode();
		TreeNode r=root.arrayToTree(tree);
		int [][]coor= {{2,1},{4,2},{6,3}};//[[2,1],[4,2],[6,3]]
		
		System.out.println(checkStraightLine(coor));
	}
	
	public static boolean checkStraightLine(int[][] coordinates) {
		int c=0;
        int m=0;
        for(int i=0;i<coordinates.length-1;i++) {
        	int x1=coordinates[i][0];
            int y1=coordinates[i][1];
            int x2=coordinates[i+1][0];
            int y2=coordinates[i+1][1];
        	int rise=y2-y1;
        	int run=x2-x1;
        	
        	if(run!=0) {
        		m=rise/run;
        		c=y1-(m*x1);
        		break;
        	}
        }
//      [[0,0],[0,1],[0,-1]]
        
        for(int i=0;i<coordinates.length;i++) {
        	int x=coordinates[i][0];
        	int y=coordinates[i][1];
        	
        	int yy=(m*x)+c;
        	int xx=m!=0?(y-c)/m:0;
        	if(yy!=y&&xx!=x)return false;
        }
        return true; 
    }
	
	
	
	
	
	
	
	
	
	
	
	static class Random{
		public int RandomInt(int min,int max) {
			return (int)Math.floor(Math.random()*(max-min+1)+min);
		}
		public double RandomDouble(double min,double max) {
			return Math.random()*(max-min+1)+min;
		}
	}
	
	static  class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	      public ListNode arrayToListNode(int[] array) {
	    	  ListNode head=new ListNode(-1);
	    	  ListNode tracker=head;
	    	  
	    	  for(int num:array) {
	    		  ListNode newNode=new ListNode(num);
	    		  tracker.next=newNode;
	    		  tracker=tracker.next;
	    	  }
	    	  return head.next;
	      }
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
	      public static TreeNode arrayToTree(Integer array[]) {
	    	    return arrayToTree(array, 0);
	      }
	     public static TreeNode arrayToTree(Integer array[], int index) {
	    	    if (index >= array.length)
	    	        return null;
	    	    if (array[index] == null)
	    	        return null;
	    	    return new TreeNode(array[index], arrayToTree(array, index * 2 + 1), arrayToTree(array, index * 2 + 2));
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

  
  
 
