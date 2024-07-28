package LeedCodeProblems;

import java.util.Arrays;

/*
26. Remove Duplicates from Sorted Array
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
The relative order of the elements should be kept the same. Then return the number of unique elements in nums
 
 Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
class Solution3 {
    public int removeDuplicates(int[] nums) {
    	int k =(int)Arrays.stream(nums).boxed().distinct().count();
    	System.out.println(k);
		return k;
        
    }
}
public class Leedcodep3 {

	public static void main(String[] args) {
		int[] nums={0,0,1,1,1,2,2,3,3,4};
		Solution3 s3 = new Solution3();
		s3.removeDuplicates(nums);
	}

}
