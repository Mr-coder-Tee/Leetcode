import java.util.*;
import java.util.List;

public class titleToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] tree = new Integer[]{1, null, 2, 3};
		TreeNode root=new TreeNode();
		TreeNode r=root.arrayToTree(tree);
		System.out.println(titleToNumber("Z"));
	}
	
	
	 public static int titleToNumber(String columnTitle) {
		 
		 if(columnTitle.length()==1)return columnTitle.charAt(0)-'A'+1;
	        
		 return 26*titleToNumber(columnTitle.substring(0, columnTitle.length()-1));
//		 return s.length()==0?0:(s.charAt(s.length()-1)-'A'+1)+26*titleToNumber(s.substring(0, s.length()-1));
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

  
  
 
