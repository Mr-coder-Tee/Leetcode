import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetMaximumGenerated {

	public static void main(String[] args) {
		// https://leetcode.com/problems/get-maximum-in-generated-array/
		System.out.println(getMaximumGenerated(7));
	}
	public static int getMaximumGenerated(int n) {
        int[]result=new int[n+1];
        result[0]=0;
        result[1]=1;
        for(int i=1;i<n+1;i++){
        	int up=2*i+1;
             if((2*i+1)>=2&&n>=(2*i+1)){
                result[2*i+1]=result[i]+result[i+1];
            }else if((2*i)<=n&&2<=(2*i)){
                result[2*i]=result[i];
            }
        }
        
        Arrays.sort(result);
        return result[n];
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

  
  
 
