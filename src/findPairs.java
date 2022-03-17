import java.util.*;
import java.util.List;

public class findPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] tree = new Integer[]{1, null, 2, 3};
		TreeNode root=new TreeNode();
		TreeNode r=root.arrayToTree(tree);
		System.out.println(findPairs (new int []{3,1,4,1,5},2));
	}
	
	public static int findPairs(int[] nums, int k) {
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++) {
        	int val=Math.abs(k-nums[i]);
        	if(map.containsKey(val)) {
        		for(int j:map.get(val)) {
        			if(j>i) {
        				ans++;
        			}
        		}
        		
        	}else {
        		List<Integer>list=new ArrayList<>();
        		list.add(i);
        		map.put(nums[i], list);
        	}
        }
        return ans;
    }
	
//	Map<Integer, Integer> map = new HashMap();
//		for (int num : nums)
//			map.put(num, map.getOrDefault(num, 0) + 1);
//
//		int result = 0;
//		for (int i : map.keySet())
//			if (k > 0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1)
//				result++;
//		return result;

	
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

  
  
 
