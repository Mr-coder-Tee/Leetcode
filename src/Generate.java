import java.util.ArrayList;
import java.util.List;

public class Generate {

	public static void main(String[] args) {
		// https://leetcode.com/problems/pascals-triangle/
		System.out.println(generate(1));
	}
	
	public static List<List<Integer>> generate(int numRows) {

		if(numRows==1)return new ArrayList<>(){{add(new ArrayList<>(){{add(1);}});}};
		if(numRows==2)return new ArrayList<>(){{add(new ArrayList<>(){{add(1);}});add(new ArrayList<>() {{add(1); add(1);}});}};
		
        List<List<Integer>>result=new ArrayList<>() {
        	{
        		add(new ArrayList<>() {{add(1);}}); 
        		add(new ArrayList<>() {{add(1); add(1);}});
        	}
        };
        
        
        for(int i=1;i<numRows-1;i++) {
        	List<Integer> num=result.get(i);
        	List<Integer>newList=new ArrayList<>() {{add(1);}};
        	for(int j=0;j<num.size()-1;j++) {
        		int n=num.get(j)+num.get(j+1);
        		newList.add(n);
        	}
        	newList.add(num.size(), 1);
        	result.add(newList);
        	//System.out.println(newList);
        }
        
        
        return result;
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

  
  
 
