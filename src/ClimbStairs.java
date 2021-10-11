import java.util.HashMap;

public class ClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int climbStairs(int n) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        if(n<=3)
            return n;
        return step(n-1,map)+step(n-2,map);
    }
     public static int step(int n,HashMap<Integer,Integer> map)
    {
        if(n<=0)
            return 1;
        
        if(map.containsKey(n))
            return map.get(n);
        int one=step(n-1,map)+step(n-2,map);
        
        map.put(n, one);
        
        return one;//+one
    }

}
