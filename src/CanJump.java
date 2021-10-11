import java.util.*;

public class CanJump {

	public static void main(String[] args) {
		// https://leetcode.com/problems/jump-game/
//		System.out.println(canJump(new int[] {2,3,1,1,4}));
//		System.out.println(canJump(new int[] {3,2,1,1,4}));
//		System.out.println(canJump(new int[] {1,2,3}));
		System.out.println(canJump(new int[] {2,5,0,0}));
	}
	public static boolean canJump(int[] nums) {
		HashMap<Integer,Boolean>map=new HashMap<>();
        return jump(nums[0],nums,map);
    }
	public static boolean jump(int index,int[] nums,HashMap<Integer,Boolean>map) {
		int l=nums.length;
		if(map.containsKey(index))return map.get(index);
		if(index>=l-1)return true;
		if(index<0)return false;
		if(nums[index]==0)return false;
		
		boolean forward=jump(index+nums[index],nums,map);
		map.put(index, forward);
		boolean backward=jump(nums[index]-index,nums,map);
		map.put(index, backward);
		
		return forward||backward;
		
	}

}
