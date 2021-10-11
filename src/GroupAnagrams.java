import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		// https://leetcode.com/problems/group-anagrams/
		System.out.println(groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
		System.out.println("[\"bat\"],[\"nat\",\"tan\"],[\"ate\",\"eat\",\"tea\"]");
	}
	public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>>map=new HashMap<>();
        
        for(String str:strs) {
        	String change=changeToSort(str);
        	if(map.containsKey(change)) {
        		List<String>adds=map.get(change);
        		adds.add(str);
        		map.put(change, adds);
        	}else {
        		List<String>putin=new ArrayList<>();
        		putin.add(str);
        		map.put(change, putin);
        	}
        }
        List<List<String>>results=new ArrayList<>();
        
        for(String key:map.keySet()) {
        	results.add(map.get(key));
        }
        
        return results;
    }
	public static String changeToSort(String str) {
		
		char []word=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			word[i]=str.charAt(i);
		}
		Arrays.sort(word);
		
		String ans="";
		
		for(char l:word) {
			ans+=l;
		}
		
		return ans;
	}
}
