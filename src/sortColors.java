import java.util.*;
import java.util.List;

public class sortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] tree = new Integer[]{1, null, 2, 3};
		TreeNode root=new TreeNode();
		TreeNode r=root.arrayToTree(tree);
		
		sortColors(new int[]{2,0,2,1,1,0});
	}
	
	 public static void sortColors(int[] nums) {
		 int n = nums.length;
	        for (int i = 1; i < n; ++i) {
	            int key = nums[i];
	            int j = i - 1;
	 
	            /* Move elements of arr[0..i-1], that are
	               greater than key, to one position ahead
	               of their current position */
	            while (j >= 0 && nums[j] > key) {
	            	nums[j + 1] = nums[j];
	                j = j - 1;
	            }
	            nums[j + 1] = key;
	        }
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
	     private static TreeNode arrayToTree(Integer array[], int index) {
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

  
  
 
