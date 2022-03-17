import java.util.*;
import java.util.List;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] tree = new Integer[]{1, null, 2, 3};
		TreeNode root=new TreeNode();
		TreeNode r=root.arrayToTree(tree);
//		rotate(new int[] {1,2,3,4,5,6,7},4);
		rotate(new int[] {1,2,3},5);//2,3,1 
		
		/*
		 4%3=1
		 5%3=2
		 6%3=0
		  0<=n<x
		 
		 */
	}
	
	 public static void rotate(int[] nums, int k) {
	        
		 int numRotations;
		 
		 if(nums.length==k) {
			 return;
		 }else if(nums.length>k) {
			 numRotations=nums.length-k;
		 }else {
			 int newK=k%nums.length;
			 numRotations=nums.length-newK;
		 }
		 
		 System.out.println(numRotations);
		 int index=numRotations;
		 Stack<Integer> stack=new Stack<>();
		 while(index<nums.length) {
			 stack.add(nums[index]);
			 index++;
		 }
		 int lastIndex=nums.length-1;
		 int i=numRotations-1;
		 while(i>=0) {
			 System.out.println("moving:"+nums[i]+" to "+lastIndex);
			 nums[lastIndex]=nums[i];
			 i--;
			 lastIndex--;
		 }
		 int j=0;
		 for(int a:stack) {
			 nums[j]=a;
			 System.out.println(a+","+j);
			 j++;
		 }
		 System.out.println(Arrays.toString(nums));
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

  
  
 
