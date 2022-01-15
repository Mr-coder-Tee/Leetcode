import java.util.ArrayList;
import java.util.List;

public class maximumswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(2736);
	}
	public static int solution(int num) {
		String strnum=Integer.toString(num);
		int max=Integer.parseInt(strnum.substring(0,1));
		int index=0;
		for(int i=1;i<strnum.length();i++) {
			int number=Integer.parseInt(strnum.substring(i,i+1));
			if(max<number) {
				max=number;
				index=i;
			}
		}
		System.out.println(max+" and index "+index);
		return 1;
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

  
  
 
