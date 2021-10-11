import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeKLists {

	public static void main(String[] args) {
		// https://leetcode.com/problems/merge-k-sorted-lists/
		ListNode[]arr=new ListNode[3];
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(4);
		ListNode l3=new ListNode(5);
		l1.next=l2;
		l2.next=l3;
		
		
		ListNode i1=new ListNode(1);
		ListNode i2=new ListNode(3);
		ListNode i3=new ListNode(4);
		i1.next=i2;
		i2.next=i3;
		
		
		ListNode k1=new ListNode(2);
		ListNode k2=new ListNode(6);
		k1.next=k2;
		
		arr[0]=l1;
		arr[1]=i1;
		arr[2]=k1;
		
		ListNode h=mergeKLists(arr);
		while(h!=null) {
			System.out.print(h.val+"->");
			h=h.next;
		}
		System.out.println();
	}
	public static ListNode mergeKLists(ListNode[] lists) {
        ListNode ans=new ListNode(-1);
        List<Integer>mylist=new ArrayList<>();
        
        for(ListNode node:lists) {
        	while(node!=null) {
        		mylist.add(node.val);
        		node=node.next;
        	}
        }
        Collections.sort(mylist);
        ListNode head=ans;
        for(int i=0;i<mylist.size();i++) {
        	ans.next=new ListNode(mylist.get(i));
        	ans=ans.next;
        }
        System.out.println(mylist);
        return head.next;
    }

}

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
