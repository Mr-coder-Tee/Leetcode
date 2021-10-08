import java.util.Arrays;
import java.util.HashMap;

public class GetKth {

	public static void main(String[] args) {
		// https://leetcode.com/problems/sort-integers-by-the-power-value/
//		System.out.println(getKth(12,15,2));
//		System.out.println(getKth(1,1,1));
//		System.out.println(getKth(7,11,4));
//		System.out.println(getKth(10,20,5));
		System.out.println(getKth(1,1000,777));
//		System.out.println(power(14));
	}
public static int getKth(int lo, int hi, int k) {
        int ans=0;
        int length=hi-lo+1;
        int[]arr=new int[length];
        int index=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=lo;i<=hi;i++) {
        	int p=power(i);
        	map.put(i, p);
        	if(p== 570)
        	System.out.println(p);
        	if (index<length) {
        		arr[index]=p;
        		index++;
        	}
        }
        Arrays.sort(arr);
        int nth=arr[k-1];
        for(int key:map.keySet()) {
        	if(map.get(key)==nth) {
        		return key;
        	}
        }
        return -1;
    }

	public static int power(int num) {
		if(num==1)return 0;
		if(num%2==0)return power(num/2)+1;
		return power(3*num+1)+1;
	}

}
