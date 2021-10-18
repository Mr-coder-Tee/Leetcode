import java.util.ArrayList;
import java.util.List;

public class Generate {

	public static void main(String[] args) {
		// https://leetcode.com/problems/pascals-triangle/
		System.out.println(generate(1));
	}
	
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>>result=new ArrayList<>() {
        	{
        		add(new ArrayList<>() {{add(1);}}); 
        		add(new ArrayList<>() {{add(1); add(1);}});
        	}
        };
        if(numRows==1)
            return new ArrayList<>(){{add(new ArrayList<>(){{add(1);}});}};
        	for(int k=1;k<numRows-1;k++) {
        		List<Integer>list=result.get(k);
//        		System.out.println(list);
        		List<Integer>temp=new ArrayList<>() {
        			{add(1);};
        		};
        		for(int j=0;j<list.size()-1;j++) {
        			temp.add(list.get(j)+list.get(j+1));
        		}
        		temp.add(1);
//        		System.out.println(temp+"-");
        		result.add(temp);
        		
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

  
  
 
