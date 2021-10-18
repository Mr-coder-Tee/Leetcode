import java.util.ArrayList;
import java.util.List;

public class codingThing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RecursionChallenge(4));
	}
	public static int SearchChallages(int num) {
		
		int results=0;
		for(int i=1;i<num;i++) {
			if(i%3==0||i%5==0)
			{
				results+=i;
			}
		}
		return results;
	}
	
	public static int RecursionChallenge(int num) {
		if(num<=1)return 1;
		
		return num*RecursionChallenge(num-1);
	}
	public  String StringChallenge(String str) {
		int numX=0,numO=0;
		for(char l:str.toCharArray()) {
			if(l=='x')
				numX++;
			else
				numO++;
		}
		
		
		return Boolean.toString(numX==numO);
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

  
  
 
