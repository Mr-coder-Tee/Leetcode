import java.util.*;
import java.util.List;

public class reverseBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] tree = new Integer[]{1, null, 2, 3};
		TreeNode root=new TreeNode();
		TreeNode r=root.arrayToTree(tree);
		int []arr={1,2};
		ListNode h=new ListNode();
		ListNode head=h.arrayToListNode(arr);
		ListNode l=reverseBetween(head,1,2);
		
		while(l!=null)
		{
			System.out.println(l.val);
			l=l.next;
		}
		
	}
	
	
	public static ListNode reverseBetween(ListNode head, int left, int right) {
		if(left==right)return head;
        	
		int i=0,j=0;
		ListNode first=null,last=null,curr=null;
		ListNode h=head;
		while(i<=left&&j<=right) {
			
			if(i+1==left) {
				first=h;
				curr=h.next;
			}
			if(j+1==right) {
				last=h.next;
			}
			h=h.next;
			i++;
			j++;
		}
		
		
		int k=left;
		while(k<right) {
			ListNode temp=curr.next;
			curr.next=last;
			last=curr;
			curr=temp;
			k++;
		}
		first.next=curr;
        return head;
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

  
  
 
