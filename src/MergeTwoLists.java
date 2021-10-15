import java.util.ArrayList;
import java.util.List;

public class MergeTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode ans=new ListNode(0);
	        ListNode last=ans;
	        while(l1!=null&&l2!=null)
	        {
	            if(l1.val<l2.val)
	            {
	                last.next=l1;
	                last=l1;
	                l1=last.next;
	            }else
	            {
	                last.next=l2;
	                last=l2;
	                l2=l2.next;
	            }
	        }
	        if(l1!=null)
	            last.next=l1;
	        if(l2!=null)
	            last.next=l2;
	        
	        return ans.next;
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

  
  
 
