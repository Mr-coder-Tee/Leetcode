import java.util.*;

public class findAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] tree = new Integer[]{1, null, 2, 3};
		TreeNode root=new TreeNode();
		TreeNode r=root.arrayToTree(tree);
		
		System.out.println(findAnagrams("cbaebabacd","abc"));
		
		
	}
	
	private boolean checkAnagram(int[] freq) {
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != 0) {
				return false;
			}
		}
		return true;
	}  
	public static List<Integer> findAnagrams(String s, String p) {
        List<Integer>list=new ArrayList<>();
        List<Store>storelist=new ArrayList<>();
        int n=p.length();
        for(int i=0;i<s.length()-n+1;i++) {
        	String subS=s.substring(i,i+n);
        	Store store=new Store(i,subS);
        	storelist.add(store);
        }
        
        char[]arr=p.toCharArray();
		Arrays.sort(arr);
		//String newP=arr.toString();
		//System.out.println(newP);
        for(Store store:storelist) {
        	char[]fromStore=store.sortString();
        	int i=0;
        	for(;i<arr.length;i++) {
        		if(fromStore[i]!=arr[i]) {
        			break;
        		}
        	}
        	if(i==arr.length) {
        		list.add(store.index);
        	}
        }
        
        
        return list;
    }
	
	static class Store{
		int index;
		String substring;
		public Store(int index,String substring) {
			this.index=index;
			this.substring=substring;
		}
		public char[] sortString() {
			char[]arr=substring.toCharArray();
			Arrays.sort(arr);
			return arr;
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

  
  
 
