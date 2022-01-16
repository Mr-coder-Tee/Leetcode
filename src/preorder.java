import java.util.*;
import java.util.List;

public class preorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[1,null,3,2,4,null,5,6]
		
		Node root=new Node(1);
		Node child=new Node(3);
		root.neighbors.add(child);
		root.neighbors.add(new Node(2));
		root.neighbors.add(new Node(4));
		child.neighbors.add(new Node(5));
		child.neighbors.add(new Node(6));
		System.out.println(preorder(root));
		System.out.println("[1,3,5,6,2,4]");
	}
	
	
	public static List<Integer> preorder(Node root) {
        Stack<Node>stack=new Stack<>();
        List<Integer>ans=new ArrayList<>();
        
        stack.push(root);
        
        while(!stack.isEmpty()) {
        	Node curr=stack.pop();
        	
        	ans.add(curr.val);
        	List<Node>currList=curr.neighbors;
        	for(int i=currList.size()-1;i>=0;i--) {
        		stack.push(currList.get(i));
        	}
        }
        
        return ans;
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

  
  
 
