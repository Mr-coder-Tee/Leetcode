import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //
          ListNode ans=new ListNode(0);
        
        ListNode current1=l1;
        ListNode current2=l2;
        ListNode last=ans;
        int remainder=0;
        
        while(current1!=null|| current2!=null)
        {
           
            int newVal=0,x,y;
            if(current1==null)
                x=0;
            else
                x=current1.val;
            
            if(current2==null)
                y=0;
            else
                y=current2.val;
                
            int c=x+y+remainder;
            newVal=c%10;
            remainder=c/10;
            
            ListNode newNode=new ListNode(newVal);
            
            last.next=newNode;
            last=newNode;
            
            if(current1!=null)
                current1=current1.next;
            if(current2!=null)
                current2=current2.next;
        }
        if(remainder>0){
            last.next=new ListNode(remainder);
        }
        
        return ans.next;
       //
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

  
  
 
