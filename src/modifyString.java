import java.util.*;
import java.util.List;

public class modifyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] tree = new Integer[]{1, null, 2, 3};
		TreeNode root=new TreeNode();
		TreeNode r=root.arrayToTree(tree);
		
		System.out.println(modifyString("o?m"));
	}
	
	public static String modifyString(String s) {
		
		if(s.length()==1) {
			if(s.equals("?"))return "a";
			return s;
		}
			
		Random r=new Random();
		String s2=s;
		
        while(s2.indexOf('?')!=-1) {
        	int index=s2.indexOf('?');
        	int num=Math.abs(r.RandomInt(0, Integer.MAX_VALUE))%26;
        	
        	String replacer=Character.toString('a'+num);
        	String backup=Character.toString('a'+(num/2)+1);
        	
        	if(index==s.length()-1) {
        		if(s.charAt(s.length()-2)==replacer.charAt(0)) {
        			s2=s2.substring(0,index)+backup;
        		}else {
        			s2=s2.substring(0,index)+replacer;
        		}
        		
        	}
        	else if(index==0) {
        		if(s.charAt(1)==replacer.charAt(0)) {
        			s2=backup+s2.substring(1);
        		}else {
        			s2=replacer+s2.substring(1);
        		}
        		
        	}
        	else {
        		if(s.charAt(index-1)==replacer.charAt(0)) {
        			s2=s2.substring(0,index)+backup+s2.substring(index+1);
        		}else {
        			s2=s2.substring(0,index)+replacer+s2.substring(index+1);
        		}
        		if(s.charAt(index+1)==replacer.charAt(0)) {
        			s2=s2.substring(0,index)+backup+s2.substring(index+1);
        		}else {
        			s2=s2.substring(0,index)+replacer+s2.substring(index+1);
        		}
        		
        	}
        	
        }
        
        return s2;
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

  
  
 
