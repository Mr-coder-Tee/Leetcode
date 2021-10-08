import java.util.*;


public class findItinerary {

	public static void main(String[] args) {
		// https://leetcode.com/problems/reconstruct-itinerary/submissions/
		List<List<String>> tickets=new ArrayList<>();
		List<String>list=new ArrayList<String>() {{add("JFK");add("SFO");}};
		List<String>list2=new ArrayList<String>() {{add("JFK");add("ATL");}};
		List<String>list3=new ArrayList<String>() {{add("SFO");add("ATL");}};
		List<String>list4=new ArrayList<String>() {{add("ATL");add("JFK");}};
		List<String>list5=new ArrayList<String>() {{add("ATL");add("SFO");}};

		tickets.add(list);
		tickets.add(list2);
		tickets.add(list3);
		tickets.add(list4);
		tickets.add(list5);
		
		
		
		//[["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]
		List<List<String>> tickets2=new ArrayList<>();
		List<String>l=new ArrayList<String>() {{add("MUC");add("LHR");}};
		List<String>l2=new ArrayList<String>() {{add("JFK");add("MUC");}};
		List<String>l3=new ArrayList<String>() {{add("SFO");add("SJC");}};
		List<String>l4=new ArrayList<String>() {{add("LHR");add("SFO");}};
		
		
		tickets2.add(l3);
		tickets2.add(l);
		tickets2.add(l2);
		tickets2.add(l4);
		
		
		//[["JFK","KUL"],["JFK","NRT"],["NRT","JFK"]]---->["JFK","NRT","JFK","KUL"]
		//iterate thro all posible list
		
		System.out.println(FindItinerary(tickets2)+"---->[\"JFK\",\"MUC\",\"LHR\",\"SFO\",\"SJC\"]");
		System.out.println(FindItinerary(tickets)+"---->[\"JFK\",\"ATL\",\"JFK\",\"SFO\",\"ATL\",\"SFO\"]");
	}
	 public static List<String> FindItinerary(List<List<String>> tickets) {
		 List<String>ans=new ArrayList<>();
		 HashMap<String,List<String>>map=new HashMap<>();
		 for(int i=0;i<tickets.size();i++) {
			 List<String> temp=tickets.get(i);
			 String from=temp.get(0);
			 String to=temp.get(1);
			 
			 if(map.containsKey(from)) {
				 List<String> list=map.get(from);
				 list.add(to);
				 map.put(from, list);
				 
			 }else {
				 List<String> list=new Stack<>();
				 list.add(to);
				 map.put(from,list);
			 }
		 }
	        
//		 System.out.println(map);
//		 
//		 for(String key:map.keySet()) {
//			 System.out.println(key);
//		 }
		 
		 List<String> orig=map.get("JFK");
		List<List<String>>answers=new ArrayList<>();
		 List<String>route=new ArrayList<>();
		 route.add("JFK");
		 for(int i=0;i<orig.size();i++) {
			 List<String>temp=orig;
			 String n=temp.remove(i);
			 route.add(n);
			 map.put("JFK", temp);
			 answers.add(Path(n,map,route));
		 }
		 List<String> large=answers.get(0);
		 List<String>large2=answers.get(0);
		 for(int i=1;i<answers.size();i++) {
			 if(large.size()<answers.size()) {
				 large=answers.get(i);
			 }else if(large.size()==answers.size()) {
				 large2=answers.get(i);
			 }
			 
		 }
		 if(large.size()==large2.size()) {
			 for(int i=0;i<large.size();i++) {
				 if(large.get(i).compareTo(large2.get(i))>0){
					 return large2;
				 }else {
					 return large;
				 }
			 }
			 
		 }else {
			 ans=large;
		 }
		 
//		 System.out.println(a);
//		 while(!jfk.isEmpty()) {
//			 String key=jfk.pop();
//			 List<String> a=Path(key,map,route);
//			 System.out.println(a);
//		 }
		 
		 return ans;
	 }
	 public static List<String> Path(String key,HashMap<String,List<String>> map,List<String> route) {
//		System.out.println("stack of "+key+"->"+map.get(key));
		 
		 List<String>list=map.get(key);
//		 System.out.println(list);
		 if(list==null||list.isEmpty()) {
			 return route;
		 }
		 String nextdest=list.get(0);
		 int index=map.get(key).indexOf(nextdest);
		 String removed=map.get(key).remove(index);
//		 System.out.println("next destination-> "+nextdest);
//		 System.out.println();
		
		 
		 

//		 route.add(key);
		 route.add(nextdest);
		 
		 return Path(nextdest,map,route);
	 }
}

class Tickets{
	
	String location;
	List<Tickets>to;
	public Tickets(String location) {
		this.location=location;
	}
	public void AddDestination(String to) {
		this.to.add(new Tickets(to));
	}
}
