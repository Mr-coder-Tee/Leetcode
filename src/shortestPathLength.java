import java.util.*;
import java.util.List;

public class shortestPathLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] tree = new Integer[]{1, null, 2, 3};
		TreeNode root=new TreeNode();
		TreeNode r=root.arrayToTree(tree);
		int [][]arr= {{1,2,4},{0},{0}};
		shortestPathLength(arr);
	}
	
	public static int shortestPathLength(int[][] graph) {
		Graph grph=new Graph();
        for(int i=0;i<graph.length;i++) {
        	grph.createGraph(i, graph[i]);
        }
        
        return -1;
    }
	public static void dfs(GraphNode graphnode) {
		if(graphnode.map.isEmpty())return;
		
		for(int key:graphnode.map.keySet()) {
			
		}
	}
	
	
	static class Graph{
		 HashMap<Integer,GraphNode>graph=new HashMap<>();
		
		Graph(){
			
		}
		public void createGraph(int index,int []naighbors){
			GraphNode graphnode=new GraphNode(index);
			for(int i=0;i<naighbors.length;i++) {
				if(graph.containsKey(naighbors[i])) {
					GraphNode node=graph.get(naighbors[i]);
					graphnode.addList(node);
				}else {
					graphnode.addNode(index,naighbors[i]);
				}
			}
			graph.put(index, graphnode);
		}
		
	}
	static class GraphNode{
		private HashMap<Integer,List<GraphNode>>map=new HashMap<>();
		
		int index;
		private boolean isVisited=false;
		GraphNode(){
			
		}
		GraphNode(int index){
			this.index=index;
			
		}
		public void addNode(int index,int val) {
			if(map.containsKey(index)) {
				List<GraphNode>list=map.get(index);
				list.add(new GraphNode(val));
				map.replace(index, list);
			}else {
				List<GraphNode>list=new ArrayList<>();
				list.add(new GraphNode(val));
				map.put(index, list);
			}
		}
		public void addList(GraphNode nodelist) {
			if(!map.containsKey(index)) {
				List<GraphNode>list=new ArrayList<>();
				list.add(nodelist);
				map.put(index, list);
			}else {
				List<GraphNode>list=map.get(index);
				list.add(nodelist);
				map.replace(index, list);
			}
			
		}
		public boolean checkIsVisited() {
			return isVisited;
		}
		public void makeAsVisted() {
			this.isVisited=true;
		}
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
	      public ListNode arrayToListNode(int[] array) {
	    	  ListNode head=new ListNode(-1);
	    	  ListNode tracker=head;
	    	  
	    	  for(int num:array) {
	    		  ListNode newNode=new ListNode(num);
	    		  tracker.next=newNode;
	    		  tracker=tracker.next;
	    	  }
	    	  return head.next;
	      }
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

  /*
   
   
   class Solution {
    private int[][] cache;
    private int endingMask;
    
    public int dp(int node, int mask, int[][] graph) {
        if (cache[node][mask] != 0) {
            return cache[node][mask];
        }
        if ((mask & (mask - 1)) == 0) {
            // Base case - mask only has a single "1", which means
            // that only one node has been visited (the current node)
            return 0;
        }
        
        cache[node][mask] = Integer.MAX_VALUE - 1; // Avoid infinite loop in recursion
        for (int neighbor: graph[node]) {
            if ((mask & (1 << neighbor)) != 0) {
                int alreadyVisited = dp(neighbor, mask, graph);
                int notVisited = dp(neighbor, mask ^ (1 << node), graph);
                int betterOption = Math.min(alreadyVisited, notVisited);
                cache[node][mask] = Math.min(cache[node][mask], 1 + betterOption);
            }
        }
        
        return cache[node][mask];
    }
    
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        endingMask = (1 << n) - 1;
        cache = new int[n + 1][endingMask + 1];
        
        int best = Integer.MAX_VALUE;
        for (int node = 0; node < n; node++) {
            best = Math.min(best, dp(node, endingMask, graph));
        }
        
        return best;
    }
}
   
   
   */
  
 
