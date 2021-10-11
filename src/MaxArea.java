
public class MaxArea {

	public static void main(String[] args) {
		// https://leetcode.com/problems/container-with-most-water/submissions/
		System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
		System.out.println(maxArea(new int[] {4,3,2,1,4}));
		System.out.println(maxArea(new int[] {1,1}));
		System.out.println(maxArea(new int[] {1,2,1}));
	}
	public static int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int area=0;
        if(j<=1) {
        	return Math.min(height[i], height[j])*1;
        }
        
        while(i<j) {
        	int w=Math.min(height[i], height[j]);
        	int l=j-i;
        	area=Math.max(area, w*l);
        	if(height[i]>height[j]) {
        		j--;
        	}else if(height[i]<height[j]) {
        		i++;
        	}else if(height[i]==height[j]&&((i+1)!=j)||i!=(j-1)) {
        		if(height[i+1]>height[j-1]) {
        			i++;
        		}else {
        			j--;
        		}
        	}else {
        		i++;
        	}
        }
        
        return area;
        
    }

}
