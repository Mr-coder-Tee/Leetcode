import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public String longestCommonPrefix(String[] strs) {
         int i=strs[0].length();
        for(;i>0;i--)
        {
            String sub=strs[0].substring(0,i);
            for(String word:strs){
                if(word.indexOf(sub)!=0)
                {
                    sub="";
                    break;
                }
            }
            if(!sub.isEmpty())
                return sub;
        }
        return "";
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

  
  
 
