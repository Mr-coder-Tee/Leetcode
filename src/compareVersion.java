import java.util.*;
import java.util.List;

public class compareVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] tree = new Integer[]{1, null, 2, 3};
		TreeNode root=new TreeNode();
		TreeNode r=root.arrayToTree(tree);
//		System.out.println(compareVersion("1.0","1.0.0"));
//		System.out.println(compareVersion("1.01","1.001"));
//		System.out.println(compareVersion("0.1","1.1"));
//		System.out.println(compareVersion("1.23.0","1.023.0"));
		System.out.println(compareVersion("1.0","1.10"));
	}
	
	public static int compareVersion(String version1, String version2) {

		List<Integer>v1List=new ArrayList<>();
		List<Integer>v2List=new ArrayList<>();
		String[] arr1=version1.split("\\.");
		for(String numStr:arr1) {
			v1List.add(Integer.parseInt(numStr));
		}
		String[] arr2=version2.split("\\.");
		for(String numStr:arr2) {
			v2List.add(Integer.parseInt(numStr));
		}
		
		
		if(v1List.size()>v2List.size()) {
			int len=v1List.size()-v2List.size();
			int i=0;
			while(i<len) {
				v2List.add(0);
				i++;
			}
		}else if(v1List.size()<v2List.size()) {
			int len=v2List.size()-v1List.size();
			int i=0;
			while(i<len) {
				v1List.add(0);
				i++;
			}
		}
		
		for(int i=0;i<v1List.size();i++) {
			if(v1List.get(i)>v2List.get(i)) {
				return 1;
			}else if(v1List.get(i)<v2List.get(i)) {
				return -1;
			}
		}
		
		return 0;
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

  
  
 
