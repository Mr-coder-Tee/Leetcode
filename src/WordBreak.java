import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

	public static void main(String[] args) {
		// https://leetcode.com/problems/word-break/
		List<String>list=new ArrayList<>() {
			{add("leet");}
			{add("code");}
		};
		List<String>list2=new ArrayList<>() {
			{add("apple");}
			{add("pen");}
		};
		List<String>list3=new ArrayList<>() {
			{add("leet");}
			{add("code");}
		};
		System.out.println(wordBreak("leetcode",list));
		System.out.println(wordBreak("applepenapple",list2));
//		System.out.println(wordBreak("applepenapple",list2));
	}
	public static boolean wordBreak(String s, List<String> wordDict) {
		Set<String>set=new HashSet<>();
		for(String str:wordDict) {
			set.add(str);
		}
        for(int i=0;i<wordDict.size();i++) {
        	int index=s.indexOf(wordDict.get(i));
        	if(index>=0) {
        		s=s.substring(wordDict.get(i).length());
        	}
        }
        return s.length()==0||set.contains(s);
        //
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

  
  
 
