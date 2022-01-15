import java.util.ArrayList;
import java.util.List;

public class myAtoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("   -42a7 "));
		System.out.println(myAtoi("4193 with"));
		System.out.println(myAtoi("78-aa  78"));
		System.out.println(myAtoi("-aa090"));
		
		
	}
	
	
	public static int myAtoi(String s) {
		String digits="";
		String sign="";
        for(int i=0;i<s.length();i++) {
        	
        	if(!s.substring(i,i+1).equals(" ")) {
        		if(s.substring(i,i+1).equals("+")||s.substring(i,i+1).equals("-")) {
        			sign=s.substring(i,i+1);
        		}else if(isNumber(s.substring(i,i+1))) {
        			digits=digits+s.substring(i,i+1);
        		}else if(!sign.equals("")) {
        			digits=digits+"0";
        		}
        	}
        }
        digits=sign+digits;
        
        try {
			int number=Integer.parseInt(digits);
			return number;
		} catch (Exception e) {
			// TODO: handle exception
			
		}
        return Integer.parseInt(digits);
    }
	public static boolean isNumber(String dig) {
		try {
			int d=Integer.parseInt(dig);
			return true;
		} catch (Exception e) {
			return false;
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

  











//if (s.equals("")) {
//	return 0;
//}
//
//// helper variables
//int res = 0, i = 0, sign = 1;
//
//// get rid of whitespace
//while (i < s.length() && s.charAt(i) == ' ') {
//	i++;
//}
//
//// check for sign
//if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
//	// change if negative, iterate
//	if (s.charAt(i++) == '-') {
//		sign = -1;
//	}
//}
//
//// now iterate across digits if any
//// should only be in range 0-9
//while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
//	// check if we will go over the max
//	if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)) {
//		if (sign == -1) {
//			return Integer.MIN_VALUE;
//		}
//		return Integer.MAX_VALUE;
//	}
//	
//	// update res
//	res = res * 10 + (s.charAt(i++) - '0');
//}
//return sign * res;
  
 
