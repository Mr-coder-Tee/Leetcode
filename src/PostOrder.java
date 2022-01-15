import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;



public class PostOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(0);
		Node child1=new Node(1);
		Node child2=new Node(2);
		Node child3=new Node(3);
		Node child4=new Node(4);
		Node child5=new Node(5);
		Node child6=new Node(6);
		Node child7=new Node(7);
		Node child8=new Node(8);
		
		root.neighbors.add(child1);
		root.neighbors.add(child2);
		root.neighbors.add(child3);
		child1.neighbors.add(child4);
		child1.neighbors.add(child5);
		child2.neighbors.add(child6);
		child3.neighbors.add(child7);
		child3.neighbors.add(child6);
		
		System.out.println(postorder(root));
	}
	
	
	
	public static List<Integer> postorder(Node root) {
        Stack<Node>stack=new Stack<>();
        List<Integer>ans=new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()) {
        	Node curr=stack.pop();
        	ans.add(curr.val);
        	for(Node node:curr.neighbors) {
        		stack.add(node);
        	}
        }
        Collections.reverse(ans);
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

  
  
 
