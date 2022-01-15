import java.util.*;
import java.util.List;

public class MinJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minJumps(new int[] {100,-23,404,100,404});
		
	}
	
	
	 public static int minJumps(int[] arr) {
	        HashMap<Integer,List<Integer>>map=new HashMap<>();
	        boolean[] isVisited=new boolean[arr.length];
	        
	        for(int i=0;i<arr.length;i++) {
	        	if(map.containsKey(arr[i])) {
	        		List<Integer>newList=map.get(arr[i]);
	        		map.replace(arr[i],newList);
	        	}else {
	        		List<Integer>list=new ArrayList<>();
	        		list.add(i);
	        		map.put(arr[i],list);
	        	}
	        }
	        
	        System.out.println(dfs(arr,isVisited,0,map));
	        return 1;
	 }
	 public static int dfs(int[]arr,boolean[]isVisited,int index,HashMap<Integer,List<Integer>>map) {
		 if(index==arr.length)return 0;
		 if(index<0||index>arr.length-1)return Integer.MAX_VALUE/2;
		 if(isVisited[index])return 0;
		 isVisited[index]=true;
		 
		 //index+1
		int forward= dfs(arr,isVisited,index+1,map)+1;
		 //index-1
		//System.out.println(forward);
		int backward= dfs(arr,isVisited,index-1,map)+1;
		//System.out.println(backward);
		 //to j
		//int speed;
		int min=Math.min(forward, backward);
		 if(map.containsKey(arr[index])) {
			 List<Integer>list=map.get(arr[index]);
			 for(int element:list) {
				 if(element!=index&&element>index) {
					int speed= dfs(arr,isVisited,element,map)+1;
					min=Math.min(speed, min);
				 }
			 }
		 }
		 
		 
		 
		 
		 
		 return min;
	 }
	static class Nodes{
		int index;
		int value;
		boolean isVisited=false;
		List<Node>step;
		
		public Nodes(int index,int value) {
			this.index=index;
			this.value=value;
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

  
  
 







//int n = arr.length;
//if (n <= 1) {
//    return 0;
//}
//
//Map<Integer, List<Integer>> graph = new HashMap<>();
//for (int i = 0; i < n; i++) {
//    graph.computeIfAbsent(arr[i], v -> new LinkedList<>()).add(i);
//}
//
//List<Integer> curs = new LinkedList<>(); // store current layer
//curs.add(0);
//Set<Integer> visited = new HashSet<>();
//int step = 0;
//
//// when current layer exists
//while (!curs.isEmpty()) {
//    List<Integer> nex = new LinkedList<>();
//
//    // iterate the layer
//    for (int node : curs) {
//        // check if reached end
//        if (node == n - 1) {
//            return step;
//        }
//
//        // check same value
//        for (int child : graph.get(arr[node])) {
//            if (!visited.contains(child)) {
//                visited.add(child);
//                nex.add(child);
//            }
//        }
//
//        // clear the list to prevent redundant search
//        graph.get(arr[node]).clear();
//
//        // check neighbors
//        if (node + 1 < n && !visited.contains(node + 1)) {
//            visited.add(node + 1);
//            nex.add(node + 1);
//        }
//        if (node - 1 >= 0 && !visited.contains(node - 1)) {
//            visited.add(node - 1);
//            nex.add(node - 1);
//        }
//    }
//
//    curs = nex;
//    step++;
//}
//
//return -1;
