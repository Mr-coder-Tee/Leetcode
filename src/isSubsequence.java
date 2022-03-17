import java.util.*;
import java.util.List;

public class isSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] tree = new Integer[]{1, null, 2, 3};
		TreeNode root=new TreeNode();
		TreeNode r=root.arrayToTree(tree);
		System.out.println(isSubsequence("","ahbgdc"));
	}
	
	
	
	
	 public static boolean isSubsequence(String s, String t) {
		 	if(s.length()==0)return false;
		 	if(s.length()>t.length())return false;
		 	if(s.length()==t.length()) {
		 		if(s.equals(t))return true;
		 		return false;
		 	}
		 	System.out.println(s.length());
		 	char firstLetter=s.charAt(0);
	        int lastIndex=t.indexOf(firstLetter);
	        
	        if(lastIndex==-1)return false;
	        
	        for(int i=1;i<s.length();i++) {
	        	char c=s.charAt(i);
	        	int index=t.indexOf(c);
	        	if(index<0||index<lastIndex) return false;
	        	lastIndex=index;
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

  
  
 
