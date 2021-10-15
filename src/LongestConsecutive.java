import java.util.ArrayList;
import java.util.Arrays;

public class LongestConsecutive {

	public static void main(String[] args) {
		// https://leetcode.com/problems/longest-consecutive-sequence/
//		System.out.println(longestConsecutive(new int[] {100,4,200,1,3,2}));
		System.out.println(longestConsecutive(new int[] {0,3,7,5,8,4,6,0,1}));
		System.out.println(longestConsecutive(new int[] {0}));
		System.out.println(longestConsecutive(new int[] {}));
		System.out.println(longestConsecutive(new int[] {1,2,0,1}));
		
		
//		4
//		6
//		1
//		0
//		3

	}
	public static int longestConsecutive(int[] nums) {
		if(nums.length==0)return 0;
		Arrays.sort(nums);
		
		ArrayList<Integer>list=new ArrayList<>();
		
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]!=nums[i+1])list.add(nums[i]);
		}
		
		int []newNums=new int[list.size()];
		
		for(int i=0;i<newNums.length;i++) {
			newNums[i]=list.get(i);
		}
		
		int result=-1;
		int length=1;
		for(int i=0;i<newNums.length-1;i++) {
			if(newNums[i]+1==newNums[i+1]) {
				length++;
			}else {
				if(length>result)result=length;
				
				length=1;
			}
		}
		
        return length>result?length:result;
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

  
  
 
