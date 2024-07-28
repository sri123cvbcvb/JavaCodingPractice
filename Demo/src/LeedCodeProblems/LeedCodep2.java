package LeedCodeProblems;

import java.util.Arrays;

/*
 Remove given Element from the array and return count of an remainning array count. 
 Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
  Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */

class Solution1 {
    public int removeElement(int[] nums, int val) {
    	
    	int res = (int) Arrays.stream(nums).boxed().filter(x -> x != val).count();
		return res;
    }
}
public class LeedCodep2 {

	public static void main(String[] args) {
		int[] nums= {3,2,2,3};
		int val = 3;
		
		Solution1 s1 = new Solution1();
		int res = s1.removeElement(nums, val);
        System.out.println(res);
	}

}
