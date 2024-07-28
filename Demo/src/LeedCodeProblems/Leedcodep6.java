package LeedCodeProblems;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 *189. Rotate Array
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * 
 * Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * 
 * 
 */

class Solution6 {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        int rotate = k%l;
        
    	int[] res = IntStream.concat(
    			
    			Arrays.stream(nums, l-rotate, l ),
    			Arrays.stream(nums, 0, l-rotate)
        ).toArray();
    	
    	System.out.println(Arrays.toString(res));
    }
}
public class Leedcodep6 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k =1;
		Solution6 s6 = new Solution6();
		s6.rotate(nums, k);
 
	}

}
