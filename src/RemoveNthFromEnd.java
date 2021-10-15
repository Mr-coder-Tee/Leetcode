import java.util.ArrayList;
import java.util.List;

public class RemoveNthFromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        //19
	         if(head==null)
	            return null;
	        ListNode curr=head;
	        int sz=0;
	        while(curr!=null)
	        {
	            sz++;
	            curr=curr.next;
	        }
	        int index=sz-n;
	        //1->2->3->4->5->6->null n=5,sz=6
	        if(index==0)
	            return head.next;
	        curr=head;
	        ListNode prev=head;
	        int i=0;
	        while(curr!=null)
	        {
	            if(i==index)
	            {
	                
	                prev.next=curr.next;
	                break;
	            }
	            prev=curr;
	            i++;
	            curr=curr.next;
	        }
	        return head;
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

  
  
 
