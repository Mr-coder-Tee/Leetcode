import java.util.*;
import java.util.List;

//import sumRootToLeaf.TreeNode;

public class minDiffInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(4);
		TreeNode root1=new TreeNode(2);
		TreeNode root2=new TreeNode(6);
		TreeNode root3=new TreeNode(1);
		TreeNode root4=new TreeNode(3);
		TreeNode root5=new TreeNode(0);
		TreeNode root6=new TreeNode(1);
		
		root.left=root1;
		root.right=root2;
		root1.left=root3;
		root1.right=root4;
//		root2.left=root5;
//		root2.right=root6;
		System.out.println(minDiffInBST(root));
//		minDiffInBST(root);

	}
	
	
	
	 public static int minDiffInBST(TreeNode root) {
	        List<Integer>list=new ArrayList<>();
	        dfs(root,list);
	        
	        Collections.sort(list);
	        int min=Integer.MAX_VALUE;
	        
	        for(int i=0;i<list.size()-1;i++) {
	        	int diff=list.get(i+1)-list.get(i);
	        	min=Math.min(min, diff);
	        }
	        
	        
	        return min;
	        
	 }
	 public static void dfs(TreeNode root,List<Integer>list) {
		 if(root==null)return;
		 list.add(root.val);
		 
		 dfs(root.left,list);
		 dfs(root.right,list);
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

  
  
 
