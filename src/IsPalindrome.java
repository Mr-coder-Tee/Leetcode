import java.util.ArrayList;
import java.util.Collections;

public class IsPalindrome {

	public static void main(String[] args) {
		// https://leetcode.com/problems/valid-palindrome/
		 System.out.println(isPalindrome("0P"));
	}
	public static boolean isPalindrome(String s) {
		s=s.toLowerCase();
        ArrayList<Character>list=new ArrayList<>();
        String str="";
        for(char l:s.toCharArray()) {
        	if(Character.isLetter(l)) {
        		str+=l;
        		list.add(l);
        	}
        }
        Collections.reverse(list);
        String reversed="";
        for(char l:list) {
        	reversed+=l;
        }
        
        
        return str.equals(reversed);
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

}

  
  
 
