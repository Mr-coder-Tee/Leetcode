import java.util.ArrayList;
import java.util.List;

public class IsPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean isPalindrome(int x) {
	        if(x<0)return false;
	        if(x<9)return true;
	        int rev=0;
	        int var=x;
	        
	        while(var>0){
	            int l=var%10;
	            rev=rev*10+l;
	            var/=10;
	            System.out.println("x:"+var);
	        }
	        
	        return rev==x;
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

  
  
 
